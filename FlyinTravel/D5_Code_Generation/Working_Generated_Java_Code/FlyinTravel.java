import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class FlyinTravel {

static Vector<Member> usr_list = new Vector<Member>();
static Vector<Flight> flight_list = new Vector<Flight>();
static Vector<Bookings> booking_list = new Vector<Bookings>();
static Vector<Credit_Debitcard_Interac> Bank_Accounts = new Vector<Credit_Debitcard_Interac>();
static List<Search> sch_list = new ArrayList<Search>();

public static void main(String args[]) throws java.io.IOException
 {
 Bookings bks = new Bookings();
 int input;
 int accid=0;
 Setup(accid);
 accid = 3;
 System.out.println("\n");
 System.out.println("#############################");
 System.out.println("  WELCOME TO FLYINTRAVEL	");
 System.out.println("#############################\n");

 do
 {
 System.out.println("-----------------------\n");
 System.out.println("FlyinTravel-Main Menu");
 System.out.println("-----------------------\n");
 System.out.println("1.Search Flights");
 System.out.println("2.Signup");
 System.out.println("3.Login");
 System.out.println("4.View Booking");
 System.out.println("5.Cancel Booking");
 System.out.println("6.EXIT SYSTEM");
 input = read.GetInt();
 switch(input) {
 case 1:
	Integer t=0,np=2,n=0;
	String src = "Montreal",dst="Toronto",dte_str="15/04/2016";
	Boolean isone=true,isdom=true;
	System.out.println("    ---------------------------------------------------------------  ");
        System.out.println("    ---------------------  FlyinTravel - Search Flights MENU ------  ");
        System.out.println("    ---------------------------------------------------------------  ");
	System.out.println("Below Details need to be entered search Flights----Select prefix numbers to enter the value");
	System.out.println("1.Source");
	System.out.println("2.Destination");
	System.out.println("3.Date");
	System.out.println("4.No of Passengers");
	System.out.println("5.IsDomestic ::: Enter \'true\' for domestic OR \'false\' for International");
	System.out.println("6.IsOneway ::: Enter \'true\' for oneway OR \'false\' for Return");
	System.out.println("7.quit");
	System.out.println("Enter the option number now example 1 for Source:");
	do 
	{
		if(n!=0)
		{
		System.out.println("Enter the Next option number:");
		}
		t = read.GetInt();
		if (t == 1) {
		        System.out.println("Enter the Source Location:");
	        	src = read.GetString();
			n++;
		}
		else if (t == 2) {
	        	System.out.println("Enter the Destination Location:");
		        dst = read.GetString();
			n++;
		}
		else if (t == 3) {
	        	System.out.println("Enter the Date :  (in this format dd-mm-yyyy)");
		        dte_str = read.GetString();
			n++;
		}
		else if (t == 4) {
	        	System.out.println("Enter No of Passengers :");
		        np = read.GetInt();
			n++;
		}
		else if (t == 5) {
	        	System.out.println("Answer Travel IsDomestic  :");
			String isdom_str = read.GetString();
			Scanner sc = new Scanner(isdom_str);
			isdom = sc.nextBoolean();
			n++;
		}
		else if (t == 6) {
	        	System.out.println("Answer Travel IsOneway  :");
			String isone_str = read.GetString();
			Scanner scan = new Scanner(isone_str);
			isone = scan.nextBoolean();
			n++;
		}
		else if (t == 7) {
	        	System.out.println("Exited from Entering search options :");
		}
		else {
			System.out.println("Wrong Option Entered Try again");
		}
	}while(t!=7);
	if (n >= 6) {
	Search sch = new Search(np,isone);
	Flight flt = new Flight();
	flt.setSource(src);
	flt.setDestination(dst);
	SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	Date d_te = new Date();
        try {
	        d_te = df.parse(dte_str);
        }catch (ParseException e) {
        e.printStackTrace();
        }
	flt.setDate(d_te);
	flt.setIsDomestic(isdom);
	sch.setFlight(flt);
	sch_list.add(sch);
	Traveler tvr = new Traveler();
	tvr.setSearch(sch_list);
        tvr.SearchFlights();
	}

	if(n<6) {
	System.out.println("Not all the Required search options are entered--- Exiting search menu back to main menu");
	}
	break;
 case 2:
	System.out.println("Choose your username:");
        String uname = read.GetString();
        System.out.println("Choose your password");
        String pword = read.GetString();
        System.out.println("Enter your Name:");
        String mname = read.GetString();
        System.out.println("Enter your Age:");
        int age = read.GetInt();
        System.out.println("Enter your Email Address:");
        String Email = read.GetString();
        System.out.println("Enter your PhoneNumber:");
        int PhoneNumber = read.GetInt();
        System.out.println("Enter your Location:");
        String Loc = read.GetString();
        System.out.println("Enter your Gender:M for Male & F for Female");
        char Gender = read.GetChar();
 	Member mbr = new Member(uname,pword,mname,age,Email,Loc,PhoneNumber,Gender);
	accid = accid+1;
	Account acc = new Account(accid);
	mbr.setAccount(acc);
	acc.setMember(mbr);
	acc.Signup();
	Member m1 = new Member();
	m1 = (Member)usr_list.elementAt(2);
	break;
 case 3:
	System.out.println("    ---------------------------------------------------------------  ");
	System.out.println("    ---------------------  FlyinTravel - LOGIN MENU ---------------  ");
	System.out.println("    ---------------------------------------------------------------  ");
	System.out.println("Enter your username:");
        String uname_log = read.GetString();
        System.out.println("Enter your password");
        String pword_log = read.GetString();
	if (uname_log.equals("admin")){
	Admin A1 = new Admin();
	Account acc_a = new Account(0);
	A1.setAccount(acc_a);
	A1.setUsername(uname_log);
	A1.setPassword(pword_log);
	A1.Login();
	}
	else{
	Member m2 = new Member();
        m2.setUsername(uname_log);
        m2.setPassword(pword_log);
        m2.Login();
	}
	break;
 case 4:
        bks.ViewBooking();
	break;
 case 5:
        bks.CancelBooking();
	break;
 case 6:
 	System.out.println("\n ---------Thanks for visiting FlyinTravel-----\n");
        break;
 default:
	System.out.println("Wrong Menu options Entered\n");

        }
 } while(input!=6);
 }


public static void Setup(int account) throws java.io.IOException {

	String unames[] = {"bhanu","ram","jitin"};
	String pwords[] = {"bhanu123","ram123","jitin123"};
	String fnames[] = {"bhanuchander","ramkunchala","jitinJames"};
	String emails[] = {"b@gmail.com","r@gmail.com","j@gmail.com"};
	
	Integer cardnum[] = {11111111,22222222};
	String cardname[] = {"jitin","raki"};
	Integer Expry[] = {0416,0516};
	Integer cvv[] = {111,222};
	Integer amt[] = {500,200};

	Integer bk_id[] = {0,1,2};
	Integer price[] = {300,300,300};
	String seatno[] = {"3A,3B,3C","4A 4B 4C","5A 5B 5C"};
	Integer bag[] = {15,15,15};

	String fl_no[] = {"GO123","GO456","GO789","RET123","RET456","RET789"};
	String src[] = {"Montreal","Montreal","Montreal","Toronto","Ottawa","NewYork"};
	String dst[] = {"Toronto","Ottawa","NewYork","Montreal","Montreal","Montreal"};
	Boolean isdom[] = {true,true,false,true,true,false};
	String dte_str[] = {"15-04-2016","15-04-2016","15-04-2016","15-04-2016","15-04-2016","15-04-2016"};
	SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	Date dte = new Date();

	for (int i=0; i<3; i++) {
	account = account+1;
 	Member m_set = new Member(unames[i],pwords[i],fnames[i],25,emails[i],"Montreal",123456,'M');
	Account acc_set = new Account(account);
	m_set.setAccount(acc_set);
	acc_set.setMember(m_set);
	acc_set.Signup();
	}
	
	for(int i=0;i<3;i++) {
	Bookings bk = new Bookings(bk_id[i],price[i],seatno[i],bag[i]);
	Traveler tv = new Traveler();
        try {
        dte = df.parse(dte_str[i]);
        }catch (ParseException e) {
        e.printStackTrace();
        }

        Flight fl = new Flight(fl_no[i],src[i],dst[i],dte,isdom[i],20);
	Search sch = new Search();
	sch.setFlight(fl);
	sch_list.add(sch);
	tv.setSearch(sch_list);
	bk.setTraveller(tv);
	booking_list.addElement(bk);
	}


	for(int i=0; i<2; i++) {
	Credit_Debitcard_Interac cards = new Credit_Debitcard_Interac(cardnum[i],cardname[i],Expry[i],cvv[i],amt[i]);
	Bank_System bank_acc = new Bank_System();
	bank_acc.setBankName("Bank of Montreal");
	cards.setBank_system(bank_acc);
	Bank_Accounts.addElement(cards);
	}
	
	for(int i=0;i<6;i++) {
	try {
	dte = df.parse(dte_str[i]);
	}catch (ParseException e) {
	e.printStackTrace();
	}
	
	Flight fl = new Flight(fl_no[i],src[i],dst[i],dte,isdom[i],20);
	flight_list.addElement(fl);
	}
		
}
}
