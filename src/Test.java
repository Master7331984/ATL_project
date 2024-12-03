import java.math.BigDecimal;
import java.util.Scanner;
import java.util.SortedMap;


public class Test {
    public static void main(String[] args) {


//           Scanner scan = new Scanner(System.in);
//               System.out.println("1-ci ededi daxil edin:");
//           var a= scan.nextInt();
//               System.out.println("2-ci ededi daxil edin:");
//           var b= scan.nextInt();
//
//           var      c= a+b;
//               System.out.println(c);
//                    c= a-b;
//               System.out.println(c);
//                    c= a*b;
//               System.out.println(c);
//                    c= a/b;
//               System.out.println(c);

//         Scanner scan = new Scanner(System.in);
//        System.out.println("Adinizi daxil edin:");
//        String name=scan.nextLine();
//        System.out.println("Soyadinizi daxil edin:");
//        String surname= scan.nextLine();
//        System.out.println("Yaşınızı daxil edin:");
//        int old= scan.nextInt();
//        System.out.println(name +" "+ surname+" "+ old);

        //Ata-oğul yaşlarının hesablanması
//          Scanner scan = new Scanner(System.in);
//          System.out.println("Atanın yaşını daxil edin:");
//        int fath_old = scan.nextInt();
//        int son_old = scan.nextInt();
//          System.out.println("Oğulun yaşı:"+ son_old);
//
//          System.out.println("Atanın yaşı: "+ fath_old+ " "+ "Oğulun yaşı: "+ son_old);

        //Duzbucaqlinin perimetri ve sahesinin hesablanmasi
//        Scanner scan = new Scanner(System.in);
//           System.out.println("Duzbucaqlinin uzunlugunu daxil edin:");
//        int a= scan.nextInt();
//            System.out.println("Duzbucaqlinin enini daxil edin:");
//        int b= scan.nextInt();
//        int P= 2*(a+b);
//            System.out.println(P);
//        int S= a*b;
//            System.out.println(S);
        //yashin aylarla hesablanmasi
//        Scanner scan = new Scanner(System.in);
//              System.out.println("Yasi daxil edin:");
//        int a= scan.nextInt();
//        int yas= a*12;
//              System.out.println("Yaş"+ " "+ yas);

        //Kvadratinin sahesinin ve perimetrinin hesablanmasi
//        Scanner scan= new Scanner(System.in);
//        System.out.println("Ededi daxil edin:");
//        int a= scan.nextInt();
//        int S= a*a;
//        int P=4*a;
//        System.out.println("S="+S);
//        System.out.println("P="+P);

//        BigDecimal myBigDecimal1 = BigDecimal.valueOf(1.3);
//        BigDecimal myBigDecimal2 = BigDecimal.valueOf(1.5);
//        System.out.println(myBigDecimal1.add(myBigDecimal2));

//        Scanner scan = new Scanner(System.in);
//        System.out.println("a daxil edin:");
//        int a= scan.nextInt();
//        System.out.println("b daxil edin");
//        int b= scan.nextInt();
//        int c= a/b;
//        int d= a%b;
//        System.out.println("Tam hisse:"+" "+c);
//        System.out.println("Kesr hisse:"+" "+d);
        //Ededin mertebelere bolunmesi
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Ededi daxil edin:");
//        int a= scan.nextInt();
//        int b=a/10;
//        System.out.println("onluq mertebesi:"+" "+b);
//        int c=a%10;
//        System.out.println("teklik mertebesi:"+ " "+c);
//        int d=b*c;
//        System.out.println(d);
        //Ededin mertebelere bolunmesi
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Ededi daxil edin:");
//        int a=scan.nextInt();
//        int b=a/100;
//        System.out.println("Yuzlukler mertebesi:"+" "+ b);
//        int c=(a/10)%10;
//        System.out.println("Onluqlar mertebesi:"+" "+  c);
//        int d=a%10;
//        System.out.println("Teklikler mertebesi:"+" "+ d);
//        int e=b+c+d;
//        System.out.println("Ededlerin cemi:"+" " + e);
//            e=b-c-d;
//        System.out.println("Ededlerin ferqi:"+" "+ e);
//            e=b*c*d;
//        System.out.println("Ededlerin hasili:"+" "+e);
        // Ededlerin muqayisesi
//        Scanner scan = new Scanner(System.in);
//        int a= scan.nextInt();
//        int b= scan.nextInt();
//        System.out.println("Ededleri daxil edin"+ " "+ (a>b));
//        System.out.println("Ededleri daxil edin"+" "+ (a<b));
//        System.out.println("Ededleri daxil edin"+ " "+ (a==b));
//        System.out.println("Ededleri daxil edin"+" "+ (a!=b));

        //Ededlerin tersden oxunmasi
//        Scanner scan = new Scanner(System.in);
//        int a =scan.nextInt();
//        System.out.println("a-ni daxil edin");
//        int b= a/100;
//        int c= a/10%10;
//        int d= a%10;
//        int e= d*100+c*10+b;
//        System.out.println(e);
        // Minlikler mertebesinde
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        System.out.println("ededi daxil edin:");
//        int b= a/1000;
//        int c=(a/100%10);
//        int d=(a/10)%10;
//        int e=a%10;
//        int f= ((b*c)-(d+e));
//        System.out.println(f);
        //1-ci ve 4-cu ededlerin yerini deyishdirmek
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        System.out.println("ededi daxil edin:");
//        int b= a/1000;
//        int c=(a/100%10);
//        int d=(a/10)%10;
//        int e=(a%10);
//        int f =e*1000+c*100+d*10+b;
//        System.out.println(f);

//        Scanner scanner = new Scanner(System.in);
//        int a= scanner.nextInt();
//        boolean b=a%2==0;
//        System.out.println("ededi daxil edin"+b);

//        Scanner scan = new Scanner(System.in);
//        int a= scan.nextInt();
//        int b = a/100;
//        int c=a%10;
//        boolean d=(b==c);
//        System.out.println("eded polendromdur"+ " " +d);

        //Dordreqemli ededin cut olmasi
//        Scanner scan = new Scanner(System.in);
//        int a= scan.nextInt();
//        System.out.println("ededi daxil edin");
//        int b= a/1000;
//        boolean x=(b%2==0);
//        int c= a/100%10;
//        boolean y=(c%2==0);
//        int d= a/10%10;
//        boolean z=(d%2==0);
//        int e= a%10;
//        boolean f=(e%2==0);
//        boolean k= x && y && z && f;
//        System.out.println(k);

        //Dordreqemli ededin simmetrik olmasi
//        Scanner scan = new Scanner(System.in);
//        int a= scan.nextInt();
//        System.out.println("ededi daxil edin:");
//        int b= a/1000;
//        int c= a/100%10;
//        int d= a/10%10;
//        int e= a%10;
//        boolean f=(b==e && c==d);
//        System.out.println(f);

        //Dordreqemli ededin artan sirada duzulmesi
//        Scanner scan = new Scanner(System.in);
//        int a= scan.nextInt();
//        System.out.println("ededi daxil edin:");
//        int b= a/1000;
//        int c= a/100%10;
//        int d= a/10%10;
//        int e= a%10;
//        boolean f=(b<c && c<d && d<e);
//        System.out.println(f);

        // 3 ve ya 4 bolunme
//        Scanner scan = new Scanner(System.in);
//
//
//
//        System.out.println();

//        Scanner scan= new Scanner(System.in);
//        var Username="admin";
//        var enteredUsername
//        if(admin=="akif") {
//            System.out.println("Sisteme giris ugurludur");
//        }
//            else{
//                System.out.println("Sisteme girish ugursuzdur");
//            }
        //Ededin 4 ve 6 bolunmesini yoxlayir

//        Scanner scan = new Scanner(System.in);
//        int a= scan.nextInt();
//        System.out.println("Ededi daxil edin:");
//        var b=a/4;
//        var k=a/6;
//        boolean f= (b%4==0 && k%6==0);
//
//        if (f){
//            System.out.println("Eded tam bolunur" +f);
//        }
//        else {
//            System.out.println("Eded tam bolunmur "+f);
//        }

//      Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the month:");
//        var month= scan.nextLine();
//        var winter1 = "December";
//        var winter2 = "January";
//        var winter3 = "February";
//
//        var spring1 = "March";
//        var spring2 = "April";
//        var spring3 = "May";
//
//        var summer1 = "June";
//        var summer2 = "July";
//        var summer3 = "August";
//
//        var autumn1 = "September";
//        var autumn2 = "October";
//        var autumn3 = "November";
//
//        switch (month){
//          case "December":
//              System.out.println("Winter season:"+ " " + winter1);
//          break;
//          case "January":
//              System.out.println("Winter season:"+ " " + winter2);
//          break;
//          case "February":
//              System.out.println("Winter season:"+ " " + winter3);
//          break;
//          case "March":
//              System.out.println("Spring season:"+ " " + spring1);
//          break;
//          case "April":
//              System.out.println("Spring season:" + " " + spring2);
//          break;
//          case "May":
//              System.out.println("Spring season:" + " " + spring3);
//          break;
//          case "June":
//              System.out.println("Summer season:" + " " + summer1);
//          break;
//          case "July":
//              System.out.println("Summer season:" + " " + summer2);
//          break;
//          case "August":
//              System.out.println("Summer season:" + " " + summer3);
//          break;
//
//          case "September":
//              System.out.println("Autumn season:" + " " + autumn1);
//          break;
//          case "October":
//              System.out.println("Autumn season:" + " " + autumn2);
//          break;
//          case "November":
//              System.out.println("Autumn season:" + " " + autumn3);
//          break;
//
//          default:
//              System.out.println("Entered month does not exist!");
//      }


//       Scanner scan = new Scanner(System.in);
//       var a = 2;
//       while(a<=10){
//           if(a%2==0){
//               System.out.println(a);
//
//           }
//           a++;
//
//       }
//        Scanner scan = new Scanner(System.in);
//        var b = scan.nextInt();
//        for (var a=1; a<=10; a++){
//            System.out.println(b + "*" + a + "=" + a*b);
//
//
//        }
//        Scanner scan = new Scanner(System.in);
//        var a= scan.nextInt();
//        var b=scan.nextInt();
//        for( var a=1; a<=10; a++){
//            for(var b=1; b<=10; b++){
//                System.out.println(a + "*"+ b + "="+ (a*b));
//            }
//        }
//        int[] box = {1,4,7};
//        for (var i = box.length-1; i>=0; i--){
//            System.out.println(box[i]);
//        }

//     Scanner scan = new Scanner(System.in);
//     var a= scan.nextInt();
//     for(int i=10; i<=99; i++){
//         System.out.println("eded:"+ "" +(a/10%10+ ""+ a%10));
//     }
        // 1+2+4+8+16+32+64+128+256+512+1024

        //int a=1;
//           for (int i=2; i<=1024; i*=2){
//               System.out.println(i);

//           }
//        Scanner scan = new Scanner(System.in);
//        var a= scan.nextInt();
//        var sum=0;
//        var a=1;
//        for(long i=0; i<30; i++){
//
//            System.out.println(i+ " "+ a);
//            sum+=a;
//            a*=2;
//
//        }
//        System.out.println(sum);
//         int[] arr= {1,5,3,7};
//        for(var i=arr.length-1; i>=0; i--) {
//            System.out.println(arr[i]);
//        }
//        Scanner scan = new Scanner(System.in);
//        var a = scan.nextInt();
//        var b = scan.nextInt();
//        for(int i=0; i<5; i++){
//            a+=1;
//            System.out.println(a);
//            b+=2;
//            System.out.println(b);
//        }

        //String a = "";
        //String b = "";
        //* 4 boshluq*
//        for(int i=0; i<=3; i++){
//            System.out.print("*");
//
//            for(int j=0; j<3; j++){
//                System.out.print("+");
//                if(j==0){
//                    System.out.print("#");
//                }
//
//            }
//            System.out.println("*");
//
//        }
//           Scanner scan = new Scanner(System.in);
//           int a = scan.nextInt();
//           int n=a;
//           int say=0;
//           for(int i=1; i<=n; i++){
//               if(a%i==0){
//                   System.out.println("Ededin bolenleri:" + i);
//                   say++;
//               }
//
//
//
//           }
//            System.out.println("Ededin sayi:" + say);

//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b= scan.nextInt();
//        int say=0;
//
//        while(say>0){
//            int a = b/10;
//            if(a==b){
//                say++;
//            }
//            say+=10;
//        }
//        System.out.println("");
        //Massivdeki en boyuk ededi tapmaq
//        int max=0;
//        int[] arr = {5,7,6,33,26,99};
//        for (int i=0; i<arr.length; i++){
//
//
//            if(max<arr[i]){
//                max= arr[i];
//                System.out.println(max);
//            }
//
//        }
//
//        int[] nums = {1, 2, 3};
//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] == 3) {
//                break;
//            }
//            System.out.println(nums[i]);
//
//
//        }


    }
}























