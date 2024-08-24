//inbuilt packages in Java

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class TimeConversionByCountry {
    public static void main(String args[])
    {
     //Current date and time using now()
     ZonedDateTime currentDateTime=ZonedDateTime.now();

     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the Country name: ");
   String countryName=sc.nextLine();

   //Create a TimeZone ZoneId object using ZoneId.of() method
   ZoneId TimeZone=ZoneId.of(getZoneIdFromCountryName(countryName));

   //Converting current timezone time to specified time Zone
   ZonedDateTime zonedDateTime=currentDateTime.withZoneSameInstant(TimeZone);

   //Datetime formatting
   DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd:MMM:YYYY hh:mm:ss ");

   //print the current time in the specified time zone
   System.out.println(countryName + " time now:"+formatter.format(zonedDateTime));

    }
//This method returns the corresponding timezone id for a given country name
private static String getZoneIdFromCountryName(String countryName)
{
  switch(countryName)
  {
    case "India":
    return "Asia/Kolkata";
     
    case "Germany":
    return "Europe/Berlin";
    
    case "United States":
    return "America/New_York";
     
    case "China":
    return "Asia/Shanghai";

    case "Japan":
    return "Asia/Tokyo";

    case "Russia":
    return "Europe/Moscow";
     
    case "Italy":
    return "Europe/Rome";

    case "Spain":
    return "Europe/Madrid";

    case "United Kingdom":
    return "Europe/London";


    default:
    return "Country name is not listed!!";

    
    
    
    
  }  
}


}
       