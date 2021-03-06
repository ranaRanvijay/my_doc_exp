import java.io.*;
class College
{
	Student student[]=new Student[200];
	Faculty faculty[]=new Faculty[50];
	Security guard[]=new Security[5];
        Department dept[]=new Department[5];
	Sports sports;
	CentralLibrary centralLibrary;
        Canteen canteen;
        Admin admin;
        
        int s_count=0,f_count=0;
	public void initializeCollege()
	{
	    for(int i=0;i<5;i++)
            	dept[i]=new Department();
            sports=new Sports();				/*CREATIONAL DESIGN PATTERN : skeleton [one instance of a class with glibal access]*/
            centralLibrary=new CentralLibrary();		/*CREATIONAL DESIGN PATTERN : skeleton [one instance of a class with glibal access]*/
            canteen = new Canteen();				/*CREATIONAL DESIGN PATTERN : skeleton [one instance of a class with glibal access]*/
            admin=new Admin();					/*CREATIONAL DESIGN PATTERN : skeleton [one instance of a class with glibal access]*/


            //System.out.println("//////////////////////College : BUILDING INITIALIZED//////////////////");
           
            for(int i=0;i<5;i++)
                guard[i]=new Security();
            char ch='y';
            while(ch=='y')
            {
		
                Person person = null;				/*CREATIONAL DESIGN PATTERN : BUILDER PATTERN (defining instance but creating objects of different class)*/
 
                if((guard[0].checkId(person))==1)            
                {                
                    person=new Student();			/*CREATIONAL DESIGN PATTERN : BUILDER PATTERN (defining instance but creating objects of different class)*/
		    //student[s_count]=person;             
                    student[s_count].startCollegeDay(dept,sports,centralLibrary,canteen,admin);               
                    s_count++;           
                }
                else if(guard[0].checkId(person)==2)
		{
		    person=new Faculty();			/*CREATIONAL DESIGN PATTERN : BUILDER PATTERN (defining instance but creating objects of different class)*/
                    //faculty[f_count++]=person;
        	}     	
	   ch='n';
            	
	    }
	     
        }
	
	public static void main(String args[])
	{
		College college=new College();
                    college.initializeCollege();
	}
}
