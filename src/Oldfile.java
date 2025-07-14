public class Oldfile {

        public static void main(String[] args) {
            Main2 obj=new Main2();
            obj.meth1(5);
        }
        void meth1(int n){
            int sum=0;
            for(int i=0;i<n;i++){
                sum=sum+i;
            }
            System.out.println(sum);
        }
    }

