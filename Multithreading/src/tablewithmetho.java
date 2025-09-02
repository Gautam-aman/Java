public class tablewithmetho {
    public synchronized void table(int n){
        for(int i =0 ; i < n ; i++){
            System.out.println(syncthread.currentThread().getName() + " : " + i );
            try{
                syncthread.sleep(500);
            }
            catch(InterruptedException e){
                e.toString();
            }
        }
    }



}
