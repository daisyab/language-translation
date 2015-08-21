###**Testing Automation: Mobile App Control Centre - Malaria**

This repository aims at building a data driven test framework for the malaria part of the Mobile App Control Centre (MACC).

###**Installation**


#####Download and install Java

* Go to [Oracle's download page](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* Click on JDK Download.
* Accept the License Agreement and select the version which is compatible with your operating system.
* Click on the installer.
 
#####Download and install eclipse

* Got to [Eclipse's download page](http://www.eclipse.org/downloads/)
* Click the version of eclipse that is compatible with your operating system.
* Select a mirror and click on download.
* Unzip the downloaded folder.
* Locate and click on the executable.
* Configure the workspace location.

#####Download and install git and Egit

* First, follow the instructions on [how to set up git](https://help.github.com/articles/set-up-git/).
* Take a look at [this link](http://wiki.eclipse.org/EGit/FAQ#What_versions_of_Eclipse_does_EGit_target.3F) to see EGit targets your version of eclipse.  

In eclipse: 
* Click on Help.
* Click on Install New Software...
* Enter http://download.eclipse.org/egit/updates/ into the Work with text box.
* Click on Select All.
* Click on Next.
* Accept the License Agreement and click on Finish.

#####Clone and import project into eclipse

* Clone the project.
   ```
   
  git clone https://github.com/daisyab/testing-automation.git
    
   ```  
In eclipse,
* Click on File, New, Java Project.
* Give the project a name and click on Finish.
* Click on File, then on Import.
* Expand the General folder, click on File System and click Next.
* In the From directory text box, browse to the location of the cloned project.
* In the Into folder, click on browse and select the newly created project.
* Click on Finish.

#####Download and Install Selenium Webdriver

* Go to [selenium's download page](http://www.seleniumhq.org/download/).
* Download the Java client driver by clicking the download link adjacent to the text Java.
* Unzip the contents of the downloaded folder.
* In eclipse, right click on the project name, hover over Build Path and click on Configure Build Path...
* Click on the Libraries tab and click on Add External JARs...
* Add all JARs located in the unzipped folder as well as in the libs subfolder.
* Click on OK.
	
#####Download and install TestNG in eclipse

In eclipse:
* Click on Help.
* Click on Install New Software...
* Enter http://beust.com/eclipse in the Work with text box and click on Add.
* Enter the name 'TestNG' in the Name text box of the Add Repository dialog box and click on OK.
* In the Available Software window, click on Select All then on Next.
* Click on Next.
* Accept the License Agreement and click on Finish.  
* Restart Eclipse.
* After eclipse restarts, right click on the project name, hover over Build Path and click on Add Libraries...
* Select TestNG and click Finish.
	
#####Add JUnit4 as a Library

In eclipse,
* Right click on the project name, hover over Build Path and click on Add Libraries...
* Select JUnit and click Next.
* Click on Finish.

#####Download and add Apache POI

* Go to [Apache POI's download page](http://poi.apache.org/download.html).
* In the Binary Distribution section of the page, select a distribution of Apache POI.
* Click on the mirror to download the JAR files.
* Once they are downloaded, unzip the folder.
* In eclipse, right click on the project name, hover over Build Path and click on Configure Build Path...
* Click on the Libraries tab and click on Add External JARs...
* Add all the jar files found in the unzipped folder, and the ooxml-lib  and lib subfolders as external JARs.
* Click on OK.

Follow the installation instructions from the [MACC Installation Guide](https://github.com/Nerdylicious/app-web-server/blob/master/docs/Installation%20Guide.md) to get a copy of the code on your local machine.

Run Main.java found in src/utilities to run all test cases.
