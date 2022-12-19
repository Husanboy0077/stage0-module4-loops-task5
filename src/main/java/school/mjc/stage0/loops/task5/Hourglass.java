package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int m=0;
        if(height%2==0){
            m=height/2;
        }else {
            m=height/2+1;
        }

        for(int i=0;i<m;i++){
            int l=i;
            int r=height-1-i;
            for(int j=0;j<height;j++){
                if(l<=j&&j<=r){
                    System.out.print('8');
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println("");
        }

        int st=0;
        if(height%2==1){
            st=1;
        }
        for(int i=st;i<m;i++){
            int l=(m-1-i);
            int r=height-1-(m-1-i);
            for(int j=0;j<height;j++){
                if(l<=j&&j<=r){
                    System.out.print('8');
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println("");
        }
        //       if (height % 2 == 0){
//
//       }
//       else {
//           int s = height / 2, i;
//           for (i = 0; i < height; i++) {
//               String w = "";
//               for (int j = 0; j < height; j++) {
//                   if (i == s) {
//                       w+= j != s ? " " : "8";
//                   } else {
//                       w+="8";
//                   }
//               }
//               System.out.println(w);
//           }
//       }
    }
}
