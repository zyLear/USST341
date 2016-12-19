package client;

import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.*;
import java.nio.channels.NetworkChannel;

public class ClientChargeThread extends Thread {
	
	class patientInfo{
		String id;
		String name;
		String sex;
		String age;		
	}
	
	private Socket server;
	static private PrintWriter pw;
	static private BufferedReader br;
	
	ClientChargeThread(Socket server){
		this.server=server;
		try {
			br=new BufferedReader(new InputStreamReader(server.getInputStream()));
			pw=new PrintWriter(server.getOutputStream());
		} catch (IOException e) {
			            //与服务器连接失败
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		String message;
		try {
			while(true){
				message=br.readLine();
				analysis(message);  //分析数据
				}
								
		} catch (IOException e) {
			           //连接失败
			e.printStackTrace();
		}
	}
	//message=chooseDoctor,name(doctor),department,id
	
     private void analysis(String message){
    	 String string[]=message.split(",");
    	 if(string[0].equals("noDoctor")){
    		 Charge.notice.setText("没有合适的医生");
    	 }
    	 else if(string[0].equals("chooseDoctor")){
    		 Charge.notice.setText("请去"+string[2]+"找"+string[1]+"医生");
    	 }
    	 
    	// addInfo()
  
     }

	


	static public void Send(String department,String name,String sex,String age){
		pw.println(department+","+name+","+sex+","+age);
		pw.flush();
		System.out.println("发送给服务器："+department+","+name+","+sex+","+age);
	}
	static public void addInfo(){
		
	}

}
