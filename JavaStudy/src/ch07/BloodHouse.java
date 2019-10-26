package ch07;
public class BloodHouse {
	
	
//ÇåÇ÷ °¡´É À¯¹« Ã¼Å©	
 public boolean isPossible(Human human) {//ÈŞ¸ÕÀ» ¹Ş°Ô ÇØ³ùÀ½
	 
	 
 int age = 0; // ÇåÇ÷ÀÚÀÇ ³ªÀÌ¸¦ È®ÀÎÇÏ¿© ÀúÀå
 boolean isPossible = false; // ÇåÇ÷ °¡´É ¿©ºÎ
 
 /* ³Ñ°Ü¹ŞÀº Human Å¬·¡½º·ÎºÎÅÍ age Á¤º¸ È®ÀÎ age = ? */
 age = human.age; //or human.getAge();
 
 /* age°¡ 16¼¼ ÀÌ»ó 69¼¼ ÀÌÇÏ ÀÏ¶§¸¸ ÇåÇ÷ °¡´ÉÇÏµµ·Ï Á¶°Ç¹® ÀÛ¼º */
 if(age >=16 && age <=69) {
	 isPossible =true; //Á¶°ÇÀÌ ¼º¸³ÇÒ ¶§ Âü = ÇåÇ÷°¡´É
 }
 
 return isPossible;
 
 }

 //ÇåÇ÷ °¡´ÉÀ¯¹«ÀÇ °á°ú
 public String action(Human human) { //ÈŞ¸ÕÀ» ¹Ş°Ô ÇØ³ùÀ½
	 
 String result = ""; // ÇåÇ÷ °á°ú ÀúÀå
 boolean pos = isPossible(human);//ºÒ¸®¾ğ°ªÀ¸·Î ¸®ÅÏ 
 
 /* isPossible() ¸Ş¼Òµå¸¦ È°¿ëÇÏ¿© ÇåÇ÷ °¡´É ¿©ºÎ¸¦ È®ÀÎÇÏ´Â Á¶°Ç¹® ÀÛ¼º */
 if(pos ==true) {
	 /* ÇåÇ÷ °¡´É ½Ã result = "ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù. XX´Ô °¨»çÇÕ´Ï´Ù. */
	 result ="ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù."+ human.name+"´Ô °¨»çÇÕ´Ï´Ù.";
	 
 }else {
	 /* ÇåÇ÷ ºÒ°¡ ½Ã result = "ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù. */
	 result ="ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù.";
 }
 
 
 return result; //¸®ÅÏ
 }
}