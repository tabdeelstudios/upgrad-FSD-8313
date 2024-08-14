public class Arrays {
    public static void main(String args[]){
        int[] studentMarks = new int[10];
        studentMarks[0]=100;
        studentMarks[1]=90;
        studentMarks[2]=92;
        studentMarks[3]=65;
        studentMarks[4]=76;
        studentMarks[5]=91;
        studentMarks[6]=56;
        studentMarks[7]=97;
        studentMarks[8]=83;
        studentMarks[9]=79;

        // for(int marks : studentMarks){
        //     System.out.println(marks);
        // }

        for(int i=0; i<studentMarks.length;i++){
            System.out.println(studentMarks[i]);
        }
    }
}
