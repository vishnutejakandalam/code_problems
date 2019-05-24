#include <ESP8266WiFi.h>                    //importing the WiFi library
#include <ESP8266HTTPClient.h>              //importing the client libraries
#include <BlynkSimpleEsp8266.h>            //importing the Blynk libraries
BlynkTimer timer;                         //creating a timer instance
const char* ssid = "K V MOHAN(SRC)";      //network name
const char* password = "makemehappy";    //password of the netowrk
char* url;
void setup () {
 pinMode(A0,INPUT);                     // pin to connect x axis of joystick
 pinMode(13,OUTPUT);                    // pin to connect the button pin
 Blynk.begin("8c8fb4e6b1b54da3b396e695af813c3a",ssid,password);
 timer.setInterval(2,hello);
 }
  void loop() {
    Blynk.run();
  timer.run();
   }

void hello()
{
  int val;
  HTTPClient http;  //Declare an object of class HTTPClient
    if(analogRead(A0)==1024)
    {
      if(digitalRead(13)==0)
      {
        val=1;
    url="http://192.168.1.100/flash/1";
    }
 else if(digitalRead(13)==1)
  {
val=0;
    url="http://192.168.1.100/flash/0";
    }
      digitalWrite(13,val); 
     http.begin(url);  //Specify request destination
 int httpCode = http.GET();                                                                  //Send the request
 if (httpCode > 0) { //Check the returning code
     String payload = http.getString();   //Get the request response payload
      Serial.println(payload);                     //Print the response payload
 } 
 }
    if(analogRead(A0)<=10)
{ 
  Blynk.notify("I AM HERE");
}

}
