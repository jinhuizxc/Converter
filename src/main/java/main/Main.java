package main;

public class Main {

	public static void main(String[] args) throws Exception {
		 int port = 8100; //����socket�˿� Ĭ�϶˿�
		 if(args.length > 0 && args[0] != null) {
		 port = Integer.parseInt(args[0]); //����socket�˿�
		 }
		 try {
		 MainControl.start(port);
		 }catch(Exception e) {
		 System.out.println(e);
		 }
	}

}
