# ResortManagementSoftware
A software built using JavaFX library on the NetBeans 8.0.2 platform with MySQL server

This software has the following pages/forms: (All the forms have been built with JavaFX)

LOGIN page linked to a login database table

3 departments: Reception, Accounting and Hospitality

1. Reception contains - Check-in, Check-out and Cancellation pages. These are linked by the customer database table.

2. Hospitality contains - Housekeeping(to go to different hospitality services). 4 services given here are Room_Service, Resto_bar, Spa and Laundry. All these are linked to a Hospitality database.

3. Accounting contains - Process payment and Generate receipt pages.

There is a Java file called DBConnect, which contains to code to connect the MySQL database to the project.

The way these tables are linked is through the Room number which is the primary key.

To run this project: Import it in NetBeans and add database tables called "login", "customer2", "hospitality2".

For creating the database: Run the DBConnect.java file. On doing that, the SERVICES tab will show MySQL server. Right click on that to create the database. Then, Right click on the name of the database table and click Recreate Table option. Then, choose the .grab files from the database folder I have uploaded here. This will give you the structure of the table. Then, add some values and the Database setup is complete.

To view the different pages of this project, go to the file in NetBeans Projects-> Projectname-> src -> Packagename -> .java files and the forms.

To RUN the project, go to the Login.java page

Under that, go to the Source tab, next to the Design tab. There, right click and select the Run option.

It should open another window with the Login page. Do not be alarmed if it does not show the files when you press the green run arrow. The project is funtional.

Contributors for this project:

Mitali Mehta, NMIMS' MPSTME College, Mumbai

Vasvi Desai, NMIMS' MPSTME College, Mumbai

Pritha Patel, NMIMS' MPSTME College, Mumbai
