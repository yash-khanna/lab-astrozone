package service;

import model.User;

//Progression 2

// Type your code
public class AstroCalculator{
	public String findSign(User u) {
		String sign="";
		String m1=u.getdob();
		if(m1.equals(null)==true) {return null;}
		else{
			System.out.println(m1);
			String day=m1.substring(0,2);String month=m1.substring(3,5);String year=m1.substring(6, 10);
			int d=Integer.parseInt(day);
			int m=Integer.parseInt(month);int y=Integer.parseInt(year);
			if(m==3||m==4) {
				if((m==3 && d>=21 && d<=31)||(m==4 && d>=0 && d<=19)) {
					return "Aries";
				}
			}
			if(m==4||m==5) {
				if((m==4 && d>=20 && d<=30)||(m==5 && d>=0 && d<=20)) {
					return "Taurus";
				}
			}
			if(m==5||m==6) {
				if((m==5 && d>=21 && d<=31)||(m==6 && d>=0 && d<=20)) {
					return "Gemini";
				}
			}
			if(m==6||m==7) {
				if((m==6 && d>=21 && d<=30)||(m==7 && d>=0 && d<=22)) {
					return "Cancer";
				}
			}
			if(m==7||m==8) {
				if((m==7 && d>=23 && d<=31)||(m==8 && d>=0 && d<=22)) {
					return "Leo";
				}
			}
			if(m==8||m==9) {
				if((m==8 && d>=23 && d<=31)||(m==9 && d>=0 && d<=22)) {
					return "Virgo";
				}
			}
			if(m==9||m==10) {
				if((m==9 && d>=23 && d<=30)||(m==10 && d>=0 && d<=22)) {
					return "Libra";
				}
			}
			if(m==10||m==11) {
				if((m==10 && d>=23 && d<=31)||(m==11 && d>=0 && d<=21)) {
					return "Scorpio";
				}
			}
			if(m==11||m==12) {
				if((m==11 && d>=22 && d<=30)||(m==12 && d>=0 && d<=21)) {
					return "Sagittarius";
				}
			}
			if(m==12||m==1) {
				if((m==12 && d>=22 && d<=31)||(m==1 && d>=0 && d<=19)) {
					return "Capricorn";
				}
			}
			if(m==1||m==2) {
				if((m==1 && d>=20 && d<=31)||(m==2 && d>=0 && d<=18)) {
					return "Aquarius";
				}
			}
			if(m==2||m==3) {boolean leap=false;
				if(y%100==0) {
					if(y%4==0) {
						leap=true;
					}
				}else {
					if(y%4==0) {
						leap=true;
					}
				}
				if(leap==true) {
					if((m==2 && d>=19 && d<=29)||(m==3 && d>=0 && d<=20)) {
						return "Pisces";
					}
				}else {
					if((m==2 && d>=19 && d<=28)||(m==3 && d>=0 && d<=20)) {
						return "Pisces";
					}
				}
			}
		}
		return sign;
	}
}

