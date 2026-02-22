class Hospital {

    public static String[] findDoctorsBySpecialization(String specialization) {

        System.out.println("invoking findDoctorsBySpecialization");

        specialization = specialization.intern();

        if (specialization == "Cardiac Sciences") {
            String[] doctors = {"Dr.Devi Shetty","Dr.Naresh Trehan","Dr.Ashok Seth","Dr.Ramakanta Panda","Dr.Brian Pinto","Dr.Ajay Kaul","Dr.Z S Meharwal","Dr.Rajiv Parakh","Dr.Kunal Sarkar","Dr.Rajneesh Kapoor","Dr.Sandeep Attawar","Dr.Yogesh Vashist","Dr.Manoj Goel","Dr.Amit Chaudhary","Dr.Ravi Kumar"};
			return doctors;

        } else if (specialization == "Dental Science") {
            String[] doctors = {"Dr.Rashi Gupta","Dr.Vivek Sharma","Dr.Meera Nair","Dr.Anil Kohli","Dr.Sunita Verma","Dr.Rohit Yadav","Dr.Pooja Bansal","Dr.Amit Sinha","Dr.Kiran Gupta","Dr.Sachin Arora","Dr.Neha Kapoor","Dr.Rajesh Mehta","Dr.Anju Singh","Dr.Varun Khanna","Dr.Deepak Jain"};
			return doctors;

        } else if (specialization == "Dermatology") {
            String[] doctors = {"Dr.Jaishree Sharad","Dr.Kiran Lohia","Dr.Rashmi Shetty","Dr.Anil Sharma","Dr.Pooja Mehta","Dr.Nidhi Singh","Dr.Rohit Batra","Dr.Ajay Rana","Dr.Kavita Sharma","Dr.Megha Gupta","Dr.Ritu Arora","Dr.Sonal Verma","Dr.Amit Jain","Dr.Neelam Gupta","Dr.Sachin Verma"}; 
			return doctors;

        } else if (specialization == "Diabetology/Endocrinology") {
            String[] doctors = {"Dr.V Mohan","Dr.Shashank Joshi","Dr.Ambrish Mithal","Dr.Anil Kumar","Dr.Rajesh Singh","Dr.Pooja Sharma","Dr.Kiran Verma","Dr.Sunil Gupta","Dr.Ritu Singh","Dr.Nikhil Mehta","Dr.Deepa Sharma","Dr.Ramesh Jain","Dr.Anita Verma","Dr.Sachin Gupta","Dr.Varun Singh"}; 
			return doctors;

        } else if (specialization == "ENT") {
            String[] doctors = {"Dr.Milind Kirtane","Dr.S Kameswaran","Dr.Ashok Gupta","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Emergency and Trauma") {
            String[] doctors = {"Dr.Rajesh Agarwal","Dr.Amit Gupta","Dr.Sameer Mehta","Dr.Rohit Sharma","Dr.Anil Singh","Dr.Pooja Mehta","Dr.Kiran Verma","Dr.Sunil Gupta","Dr.Ritu Sharma","Dr.Nikhil Jain","Dr.Deepa Singh","Dr.Ramesh Mehta","Dr.Anita Sharma","Dr.Sachin Gupta","Dr.Varun Jain"}; 
			return doctors;

        } else if (specialization == "Foetal Medicine") {
            String[] doctors = {"Dr.Anita Kaul","Dr.Suresh Seshadri","Dr.Kavita Mandal","Dr.Pooja Sharma","Dr.Ritu Verma","Dr.Kiran Singh","Dr.Anil Mehta","Dr.Sunil Gupta","Dr.Nidhi Sharma","Dr.Rohit Jain","Dr.Amit Verma","Dr.Deepa Singh","Dr.Ramesh Gupta","Dr.Anita Sharma","Dr.Sachin Verma"}; 
			return doctors;

        } else if (specialization == "Gastroenterology and Hepatobiliary Sciences") {
            String[] doctors = {"Dr.Subhash Gupta","Dr.D Nageshwar Reddy","Dr.Arvinder Soin","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "General Surgery") {
            String[] doctors = {"Dr.Muffazal Lakdawala","Dr.P Raghu Ram","Dr.Arvinder Soin","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Haematology") {
            String[] doctors = {"Dr.Rahul Bhargava","Dr.Pravas Mishra","Dr.Uday Kulkarni","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Infectious Diseases") {
            String[] doctors = {"Dr.Abdul Ghafur","Dr.Gagandeep Kang","Dr.Raman Gangakhedkar","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Infertility medicine") {
            String[] doctors = {"Dr.Indira Hinduja","Dr.Firuza Parikh","Dr.Nandita Palshetkar","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Internal Medicine") {
            String[] doctors = {"Dr.Naresh Trehan","Dr.Deepak Chopra","Dr.S Ramakrishnan","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Mental Health and Behavioural Sciences") {
            String[] doctors = {"Dr.Vikram Patel","Dr.Shekhar Saxena","Dr.Sanjeev Jain","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Nephrology") {
            String[] doctors = {"Dr.Vivekanand Jha","Dr.Georgi Abraham","Dr.Pradeep Talwalkar","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Neurointerventional Radiology") {
            String[] doctors = {"Dr.Aditya Gupta","Dr.K Ganapathy","Dr.Ajit Puri","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Neurology") {
            String[] doctors = {"Dr.Sudhir Kumar","Dr.Vinit Banga","Dr.Nirmal Surya","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Neurosurgery") {
            String[] doctors = {"Dr.Sandeep Vaishya","Dr.K Ramesh Babu","Dr.Aditya Gupta","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Obstetrics and Gynaecology") {
            String[] doctors = {"Dr.Anjali Kumar","Dr.Indira Hinduja","Dr.Firuza Parikh","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Oncology") {
            String[] doctors = {"Dr.Ashok Vaid","Dr.Suresh Advani","Dr.P Raghu Ram","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Ophthalmology") {
            String[] doctors = {"Dr.T P Lahane","Dr.Radhika Tandon","Dr.Mahipal Sachdev","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Organ Transplant") {
            String[] doctors = {"Dr.Arvinder Soin","Dr.Subhash Gupta","Dr.Ashok Rajgopal","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Orthopaedics") {
            String[] doctors = {"Dr.IPS Oberoi","Dr.Ramneek Mahajan","Dr.Ashok Rajgopal","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Paediatrics") {
            String[] doctors = {"Dr.Suresh Kumar","Dr.Ramesh Agarwal","Dr.S K Kabra","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Physiotherapy and Rehabilitation") {
            String[] doctors = {"Dr.Ali Irani","Dr.P K Dave","Dr.Sriram Nene","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Plastic and Reconstructive Surgery") {
            String[] doctors = {"Dr.Mukund Jagannathan","Dr.Charu Sharma","Dr.Rajat Gupta","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Pulmonology") {
            String[] doctors = {"Dr.Randeep Guleria","Dr.Arvind Kumar","Dr.Sundeep Salvi","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Radiology") {
            String[] doctors = {"Dr.Saurabh Jha","Dr.P K Das","Dr.Sudhir Kumar","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Rheumatology") {
            String[] doctors = {"Dr.Arvind Chopra","Dr.Ramnath Misra","Dr.Anjali Sharma","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Support Specialties") {
            String[] doctors = {"Dr.Anil Mehta","Dr.Ravi Kumar","Dr.Neha Sharma","Dr.Rajesh Sharma","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta","Dr.Varun Mehta"}; 
			return doctors;

        } else if (specialization == "Thoracic Surgery") {
            String[] doctors = {"Dr.Arvind Kumar","Dr.Rajesh Shah","Dr.P Raghu Ram","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Transfusion Medicine") {
            String[] doctors = {"Dr.Ratti Ram Sharma","Dr.Gaurav Kharya","Dr.Nitin Agrawal","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Urology") {
            String[] doctors = {"Dr.Rajesh Ahlawat","Dr.Ashish Sabharwal","Dr.Anil Mandhani","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Endocrine Surgery") {
            String[] doctors = {"Dr.M Chandrashekar","Dr.Ramesh Agarwal","Dr.Partha Pratim","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Vascular Surgery") {
            String[] doctors = {"Dr.Ravul Jindal","Dr.Ashok Rajgopal","Dr.P Raghu Ram","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Liver Transplant and Hepatobiliary Sciences") {
            String[] doctors = {"Dr.Mohamed Rela","Dr.Arvinder Soin","Dr.Subhash Gupta","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Palliative Medicine") {
            String[] doctors = {"Dr.M R Rajagopal","Dr.Sushma Bhatnagar","Dr.Anil Kumar","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Medical Genetics") {
            String[] doctors = {"Dr.Madhulika Kabra","Dr.Ratna Puri","Dr.Geeta Kadayaprath","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Pain and Palliative Medicine") {
            String[] doctors = {"Dr.Sushma Bhatnagar","Dr.Nandini Vallath","Dr.M R Rajagopal","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Geriatric Medicine") {
            String[] doctors = {"Dr.Mathew Varghese","Dr.K S Jacob","Dr.Ramesh S","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"}; 
			return doctors;

        } else if (specialization == "Critical Care") {
            String[] doctors = {"Dr.Yatin Mehta","Dr.Subhal Dixit","Dr.Sapna Parikh","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;

        } else if (specialization == "Nuclear Medicine") {
            String[] doctors = {"Dr.V Balachandran","Dr.Ajit Kumar","Dr.Suresh S","Dr.Rajesh Sharma","Dr.Anil Mehta","Dr.Pooja Verma","Dr.Kiran Singh","Dr.Sunil Jain","Dr.Ritu Gupta","Dr.Amit Verma","Dr.Sachin Sharma","Dr.Nidhi Mehta","Dr.Ravi Singh","Dr.Deepak Jain","Dr.Anita Gupta"};
			return doctors;
        }

        
        return null;
    }

	public static void getDoctors(String[] doctors){
		for(String doctor : doctors){
			System.out.println(doctor);
		}
	}
}