### smi-lib-wsman

A common lib for Dell Server management via out of band management controller, wsmanlib library is written in Java language to support Webservice Management - WSMAN protocol, a DMTF standard protocol for systems management.

wsmanlib has classes that communicate over https to the target compute node exposing standard SOAP based webservices for management and monitoring. 

Almost each endpoint functin is wrapped in a Java class called Command, different commands have been added for different purpose.

Features Available 

 1-  Hardware Inventory 
 
 2-  Firmware Inventory 
 
 3-  Health Status
 
 4-  Firmware Update
 
 5-  RAID configuration 
 
 6-  iDRAC Configuration 
 
 7-  NIC and Network Management 
 
 8-  Hypervisor Deployment 
 
 9-  Node Reboot
 
 10- Node Power Actins 
 


### How to Install 

Under Construction. Not available via Maven Central yet.... 

##### Maven Example:
~~~
<dependency>
    <groupId>com.dell.isg.smi</groupId>
    <artifactId>wsmanlib</artifactId>
    <version>1.0.1</version>
</dependency>
~~~

##### Gradle Example:
~~~
compile(group: 'com.dell.isg.smi', name: 'wsmanlib', version: '1.0.1')
~~~
  
  
### API Usage 

Once Jar is downloaded or built from source code, the lib is ready for use, there are many commands available e.g 

   EnumerateSoftwareIdentityForHostCmd enumerateSoftwareIdentityForHostCmd=null;

   enumerateSoftwareIdentityForHostCmd= new EnumerateSoftwareIdentityForHostCmd(serverAddress, userName, password);
   
   Map<String, String> resultMap = enumerateSoftwareIdentityForHostCmd.execute();
   
     if (resultMap != null) {
     
               hypervisorInformation = new HypervisorInformation();
               
               hypervisorInformation.setName(resultMap.get("Name"));
               
               hypervisorInformation.setVersionName(resultMap.get("VersionString"));
            
            }
        
        } catch (Exception e) {
        
             logger.info("Unable to collect hypervisor information for the server IP {} ", wsmanCredentials.getAddress());
             
             return hypervisorInformation;
        }
 
### Setup Development Environment 

  1- Developer can check out the source code from github into IDE of choice and start contributing to the project.

  2- Download dependencies 
  
     N/A 
    
  3- Install and configure latest Gradle build tool
  
  4- Go to the project root directory and run
     
      gradle build

   This build script will download the dependencies from central maven and start building liberary  
   


### Support

Please file bugs and issues at the GitHub issues page. The code and documentation are released with no warranties or SLAs and are intended to be supported through a community driven process.

Slack Channel: codecommunity.slack.com


