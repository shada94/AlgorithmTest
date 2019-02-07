package algorithm;

public class MyJUnitClass {

public String displayMagicalNumber(int pIMin, int pIMax) { 	 
	
	int i = pIMin + 1;
	String S = "";
	if (pIMin == pIMax) return "";
	if (pIMin > pIMax) {
		int x = pIMin; 
		pIMin = pIMax; 
		pIMax = x; 
		i = pIMin + 1;
	}
	if (i == pIMax) return "";
      do {
    	  if ((i % 3) == 0)
    	  {
    		  System.out.println("H");
    		  S = S + "H";
    		  
    	  }
    	  else if ((i % 5) == 0)
    	  {
    		  System.out.println("S");
    		  S = S + "S";
    		  
    	  }
    	  else {  
    		  System.out.println(i);
    		  String str = Integer.toString(i);
    		  S = S + str;
    	  }    
          i++;
      } while (i < pIMax);
return S; 
}
}

