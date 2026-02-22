class LinkedIn{
	static String[] searchJobsByCompany(String companyName){
		if(companyName =="Amazon"){
			String[] availableJobs={"Software Engineer", "Backend Developer", "Frontend Developer", "Full Stack Developer", "Data Analyst", "Data Scientist", "DevOps Engineer", "Cloud Engineer", "Machine Learning Engineer", "AI Engineer", "Product Manager", "Program Manager", "QA Engineer", "Business Analyst", "Solutions Architect", "Technical Support Engineer", "Database Administrator", "Security Engineer", "Site Reliability Engineer", "Mobile App Developer"};
			return availableJobs;
		}else if(companyName == "Google"){
			String[] availableJobs = {"Search Engineer", "Ads Quality Analyst", "Machine Learning Researcher", "AI Product Manager", "Cloud Solutions Architect", "Site Reliability Engineer", "Android Developer", "Chrome Engineer", "YouTube Content Strategist", "Data Engineer", "Deep Learning Engineer", "Security Researcher", "UX Researcher", "Technical Program Manager", "Big Data Engineer", "Natural Language Processing Engineer", "Computer Vision Engineer", "Privacy Engineer", "Cloud Support Specialist", "Quantum Computing Researcher"};
			return availableJobs;
		}else if(companyName == "Microsoft"){
			String[] availableJobs = {"Azure Engineer", "C# Developer", "Windows System Engineer", "Cloud Security Engineer", "Power BI Developer", "Dynamics 365 Consultant", "Game Developer", "AI Research Engineer", "Enterprise Architect", "DevOps Specialist", "SharePoint Developer", "Database Engineer", "Security Analyst", "Technical Consultant", "Software Tester", "Product Designer", "IT Support Engineer", "Network Engineer", "Automation Engineer", "Release Manager"};
			return availableJobs;
		}else if(companyName == "Apple"){
			String[] availableJobs = {"iOS Developer", "MacOS Engineer", "Hardware Engineer", "Firmware Engineer", "UI Designer", "AR/VR Developer", "Chip Design Engineer", "System Integration Engineer", "Mobile QA Engineer", "Product Designer", "Security Engineer", "Audio Engineer", "Camera Software Engineer", "Battery Engineer", "Cloud Services Engineer", "Retail Tech Specialist", "AI Specialist", "Embedded Systems Engineer", "Performance Engineer", "Test Automation Engineer"};
			return availableJobs;
        }else if(companyName == "Meta"){
			String[] availableJobs = {"React Developer", "Social Media Analyst", "AR Engineer", "VR Developer", "Backend Engineer", "Frontend Engineer", "Data Scientist", "AI Researcher", "Privacy Engineer", "Content Moderation Specialist", "Ads Manager", "Growth Engineer", "Mobile Engineer", "Security Analyst", "UX Designer", "Product Analyst", "Infrastructure Engineer", "Machine Learning Engineer", "Community Manager", "Cloud Engineer"};
			return availableJobs;
        }else if(companyName == "Netflix"){
			String[] availableJobs = {"Streaming Engineer", "Content Analyst", "Recommendation Algorithm Engineer", "Video Encoding Engineer", "Backend Developer", "UI Engineer", "Data Scientist", "Cloud Engineer", "Site Reliability Engineer", "Security Engineer", "Product Manager", "QA Engineer", "Media Engineer", "DevOps Engineer", "Platform Engineer", "Analytics Engineer", "Mobile Developer", "Performance Engineer", "AI Engineer", "UX Researcher"};
			return availableJobs;
		}else if(companyName == "Tesla"){
			String[] availableJobs = {"Autopilot Engineer", "Battery Engineer", "Mechanical Engineer", "Electrical Engineer", "Embedded Systems Engineer", "Robotics Engineer", "AI Engineer", "Manufacturing Engineer", "Vehicle Software Engineer", "Control Systems Engineer", "Energy Systems Engineer", "Firmware Engineer", "Test Engineer", "Design Engineer", "Data Engineer", "Cybersecurity Engineer", "Product Manager", "Quality Engineer", "Simulation Engineer", "Automation Engineer"};
			return availableJobs;

		}else if(companyName == "IBM"){
			String[] availableJobs = {"Mainframe Developer", "Cloud Engineer", "AI Engineer", "Blockchain Developer", "Data Scientist", "Consultant", "Cybersecurity Analyst", "DevOps Engineer", "Backend Developer", "Frontend Developer", "Quantum Computing Researcher", "System Engineer", "Technical Architect", "Support Engineer", "Automation Tester", "Product Manager", "Database Engineer", "Network Engineer", "Business Analyst", "Software Engineer"};
			return availableJobs;
		}else if(companyName == "Intel"){
			String[] availableJobs = {"Chip Design Engineer", "Hardware Engineer", "Firmware Developer", "Embedded Engineer", "Validation Engineer", "Silicon Engineer", "System Architect", "AI Engineer", "Performance Engineer", "Test Engineer", "Graphics Engineer", "Software Developer", "Security Engineer", "Platform Engineer", "Data Engineer", "Automation Engineer", "Verification Engineer", "Electrical Engineer", "Research Scientist", "Product Engineer"};
			return availableJobs;
		}else if(companyName == "Oracle"){
			String[] availableJobs = {"Database Administrator", "PL/SQL Developer", "Cloud Engineer", "Java Developer", "Backend Engineer", "ERP Consultant", "Security Engineer", "DevOps Engineer", "Data Analyst", "Product Manager", "Support Engineer", "Automation Engineer", "Integration Engineer", "Technical Consultant", "QA Engineer", "System Engineer", "Cloud Architect", "AI Engineer", "Business Analyst", "Middleware Engineer"};
			return availableJobs;
		}else if(companyName == "Adobe"){
			String[] availableJobs = {"UI/UX Designer", "Frontend Developer", "Graphics Engineer", "Creative Cloud Developer", "AI Engineer", "Data Scientist", "Backend Engineer", "Cloud Engineer", "Security Engineer", "Product Manager", "QA Engineer", "Automation Engineer", "Mobile Developer", "Performance Engineer", "Research Scientist", "Technical Writer", "Design Engineer", "Support Engineer", "DevOps Engineer", "Analytics Engineer"};
			return availableJobs;
		}else if(companyName == "Salesforce"){
			String[] availableJobs = {"Salesforce Developer", "CRM Consultant", "Cloud Engineer", "Apex Developer", "Lightning Developer", "Integration Engineer", "Data Analyst", "DevOps Engineer", "Security Engineer", "Product Manager", "QA Engineer", "Automation Engineer", "Business Analyst", "Support Engineer", "Technical Architect", "UI Developer", "Mobile Developer", "AI Engineer", "Platform Engineer", "Solution Architect"};
			return availableJobs;
		}else if(companyName == "SAP"){
			String[] availableJobs = {"SAP ABAP Developer","SAP FICO Consultant","SAP MM Consultant","SAP SD Consultant","SAP Basis Administrator","SAP HANA Developer","SAP Security Consultant","Enterprise Architect","Integration Specialist","Cloud Engineer","Data Migration Specialist","Technical Consultant","Business Analyst","Support Engineer","DevOps Engineer","QA Engineer","Automation Engineer","System Analyst","Product Manager","Implementation Consultant"};
			return availableJobs;
		}else if(companyName == "Uber"){
			String[] availableJobs = {"Ride Systems Engineer","Backend Developer","Mobile App Developer","Data Scientist","Pricing Analyst","Map Engineer","AI Engineer","DevOps Engineer","Cloud Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","Support Engineer","Operations Analyst","Frontend Developer","Platform Engineer","Site Reliability Engineer","Growth Analyst"};
			return availableJobs;
		}else if(companyName == "Airbnb"){
			String[] availableJobs = {"Booking Platform Engineer","Frontend Developer","Backend Developer","Data Analyst","UX Designer","Product Manager","Cloud Engineer","Security Engineer","DevOps Engineer","Mobile Developer","QA Engineer","Automation Engineer","Trust and Safety Analyst","Community Support Specialist","Pricing Analyst","AI Engineer","Search Engineer","Performance Engineer","Content Strategist","Business Analyst"};
			return availableJobs;
		}else if(companyName == "Twitter"){
			String[] availableJobs = {"Timeline Engineer","Backend Developer","Frontend Developer","Data Scientist","AI Engineer","Security Engineer","Cloud Engineer","DevOps Engineer","Product Manager","QA Engineer","Automation Engineer","Content Moderation Specialist","Site Reliability Engineer","Mobile Developer","Analytics Engineer","Privacy Engineer","UX Designer","Support Engineer","Growth Engineer","Ad Tech Engineer"};
			return availableJobs;
		}else if(companyName == "LinkedIn"){
			String[] availableJobs = {"Recommendation Engineer","Backend Developer","Frontend Developer","Data Scientist","AI Engineer","Search Engineer","Cloud Engineer","DevOps Engineer","Product Manager","QA Engineer","Automation Engineer","Security Engineer","Business Analyst","Site Reliability Engineer","Mobile Developer","Analytics Engineer","UX Designer","Support Engineer","Growth Engineer","Content Strategist"};
			return availableJobs;
		}else if(companyName == "Spotify"){
			String[] availableJobs = {"Audio Engineer","Streaming Engineer","Backend Developer","Frontend Developer","Data Scientist","Recommendation Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Product Manager","QA Engineer","Automation Engineer","Security Engineer","Mobile Developer","UX Designer","Analytics Engineer","Content Curator","Support Engineer","Growth Engineer","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "PayPal"){
			String[] availableJobs = {"Payment Systems Engineer","Backend Developer","Frontend Developer","Data Analyst","Fraud Analyst","Security Engineer","Cloud Engineer","DevOps Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","Mobile Developer","Site Reliability Engineer","Compliance Analyst","Risk Analyst","Support Engineer","Analytics Engineer","API Developer","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Stripe"){
			String[] availableJobs = {"Payment API Developer","Backend Engineer","Frontend Developer","Data Scientist","Security Engineer","Cloud Engineer","DevOps Engineer","Product Manager","QA Engineer","Automation Engineer","Fraud Detection Engineer","Business Analyst","Mobile Developer","Site Reliability Engineer","Compliance Specialist","Risk Analyst","Support Engineer","Analytics Engineer","Platform Engineer","Integration Engineer"};
			return availableJobs;
		}else if(companyName == "Accenture"){
			String[] availableJobs = {"Consultant","Cloud Engineer","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","DevOps Engineer","Security Engineer","Business Analyst","QA Engineer","Automation Engineer","SAP Consultant","Salesforce Developer","Project Manager","Product Manager","Support Engineer","Network Engineer","System Administrator","Integration Engineer","Technical Architect"};
			return availableJobs;
		}else if(companyName == "TCS"){
			String[] availableJobs = {"Java Developer","Backend Developer","Frontend Developer","Data Analyst","Cloud Engineer","DevOps Engineer","QA Engineer","Automation Tester","Business Analyst","Support Engineer","System Administrator","Network Engineer","Security Analyst","AI Engineer","Database Administrator","Mobile Developer","Project Manager","Technical Lead","Integration Engineer","Software Engineer"};
			return availableJobs;
		}else if(companyName == "Infosys"){
			String[] availableJobs = {"Java Developer","Backend Developer","Frontend Developer","Data Analyst","Cloud Engineer","DevOps Engineer","QA Engineer","Automation Tester","Business Analyst","Support Engineer","System Administrator","Network Engineer","Security Analyst","AI Engineer","Database Administrator","Mobile Developer","Project Manager","Technical Lead","Integration Engineer","Software Engineer"};
			return availableJobs;
		}else if(companyName == "Wipro"){
			String[] availableJobs = {"Application Developer","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","QA Engineer","Automation Tester","Business Analyst","Support Engineer","System Engineer","Network Engineer","Security Analyst","Data Analyst","AI Engineer","Database Administrator","Mobile Developer","Project Manager","Technical Consultant","Integration Engineer","Software Engineer"};
			return availableJobs;
		}else if(companyName == "HCL"){
			String[] availableJobs = {"Software Developer","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","QA Engineer","Automation Tester","Business Analyst","Support Engineer","System Administrator","Network Engineer","Security Analyst","Data Analyst","AI Engineer","Database Administrator","Mobile Developer","Project Manager","Technical Lead","Integration Engineer","Product Engineer"};
			return availableJobs;
		}else if(companyName == "Capgemini"){
			String[] availableJobs = {"Consultant","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","QA Engineer","Automation Tester","Business Analyst","Support Engineer","System Engineer","Network Engineer","Security Analyst","Data Analyst","AI Engineer","Database Administrator","Mobile Developer","Project Manager","Technical Architect","Integration Engineer","Software Engineer"};
			return availableJobs;
		}else if(companyName == "Cognizant"){
			String[] availableJobs = {"Programmer Analyst","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","QA Engineer","Automation Tester","Business Analyst","Support Engineer","System Administrator","Network Engineer","Security Analyst","Data Analyst","AI Engineer","Database Administrator","Mobile Developer","Project Manager","Technical Lead","Integration Engineer","Software Engineer"};
			return availableJobs;
		}else if(companyName == "Deloitte"){
			String[] availableJobs = {"Consultant","Audit Analyst","Tax Analyst","Risk Analyst","Cybersecurity Analyst","Cloud Engineer","Data Analyst","Business Analyst","DevOps Engineer","QA Engineer","Automation Engineer","Support Engineer","System Administrator","Project Manager","Product Manager","AI Engineer","Integration Engineer","Technical Architect","Compliance Analyst","Strategy Analyst"};
			return availableJobs;
		}else if(companyName == "EY"){
			String[] availableJobs = {"Consultant","Audit Associate","Tax Consultant","Risk Analyst","Cybersecurity Analyst","Cloud Engineer","Data Analyst","Business Analyst","DevOps Engineer","QA Engineer","Automation Engineer","Support Engineer","System Engineer","Project Manager","Product Manager","AI Engineer","Integration Engineer","Technical Architect","Compliance Analyst","Strategy Consultant"};
			return availableJobs;
		}else if(companyName == "PwC"){
			String[] availableJobs = {"Consultant","Audit Associate","Tax Analyst","Risk Consultant","Cybersecurity Analyst","Cloud Engineer","Data Analyst","Business Analyst","DevOps Engineer","QA Engineer","Automation Engineer","Support Engineer","System Administrator","Project Manager","Product Manager","AI Engineer","Integration Engineer","Technical Architect","Compliance Analyst","Strategy Analyst"};
			return availableJobs;
		}else if(companyName == "KPMG"){
			String[] availableJobs = {"Consultant","Audit Associate","Tax Consultant","Risk Analyst","Cybersecurity Analyst","Cloud Engineer","Data Analyst","Business Analyst","DevOps Engineer","QA Engineer","Automation Engineer","Support Engineer","System Engineer","Project Manager","Product Manager","AI Engineer","Integration Engineer","Technical Architect","Compliance Analyst","Strategy Consultant"};
			return availableJobs;
		}else if(companyName == "McKinsey"){
			String[] availableJobs = {"Business Analyst","Strategy Consultant","Data Scientist","AI Consultant","Product Manager","Project Manager","Research Analyst","Operations Consultant","Digital Consultant","UX Designer","Cloud Engineer","DevOps Engineer","Security Analyst","Market Analyst","Financial Analyst","Growth Consultant","Analytics Engineer","Implementation Consultant","Technical Consultant","Knowledge Analyst"};
			return availableJobs;
		}else if(companyName == "BCG"){
			String[] availableJobs = {"Business Analyst","Strategy Consultant","Data Scientist","AI Consultant","Product Manager","Project Manager","Research Analyst","Operations Consultant","Digital Consultant","UX Designer","Cloud Engineer","DevOps Engineer","Security Analyst","Market Analyst","Financial Analyst","Growth Consultant","Analytics Engineer","Implementation Consultant","Technical Consultant","Knowledge Analyst"};
			return availableJobs;
		}else if(companyName == "Bain"){
			String[] availableJobs = {"Business Analyst","Strategy Consultant","Data Scientist","AI Consultant","Product Manager","Project Manager","Research Analyst","Operations Consultant","Digital Consultant","UX Designer","Cloud Engineer","DevOps Engineer","Security Analyst","Market Analyst","Financial Analyst","Growth Consultant","Analytics Engineer","Implementation Consultant","Technical Consultant","Knowledge Analyst"};
			return availableJobs;
		}else if(companyName == "Goldman Sachs"){
			String[] availableJobs = {"Investment Banker","Financial Analyst","Risk Analyst","Quantitative Analyst","Data Scientist","Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","Security Analyst","DevOps Engineer","QA Engineer","Automation Engineer","Business Analyst","Compliance Analyst","Wealth Manager","Portfolio Manager","Trading Analyst","Research Analyst","Product Manager"};
			return availableJobs;
		}else if(companyName == "JP Morgan"){
			String[] availableJobs = {"Investment Banker","Financial Analyst","Risk Analyst","Quantitative Analyst","Data Scientist","Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","Security Analyst","DevOps Engineer","QA Engineer","Automation Engineer","Business Analyst","Compliance Analyst","Wealth Manager","Portfolio Manager","Trading Analyst","Research Analyst","Product Manager"};
			return availableJobs;
		}else if(companyName == "Morgan Stanley"){
			String[] availableJobs = {"Investment Banker","Financial Analyst","Risk Analyst","Quantitative Analyst","Data Scientist","Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","Security Analyst","DevOps Engineer","QA Engineer","Automation Engineer","Business Analyst","Compliance Analyst","Wealth Manager","Portfolio Manager","Trading Analyst","Research Analyst","Product Manager"};
			return availableJobs;
		}else if(companyName == "HSBC"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Data Analyst","Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","Security Analyst","DevOps Engineer","QA Engineer","Automation Engineer","Business Analyst","Wealth Manager","Portfolio Manager","Audit Analyst","Fraud Analyst","Research Analyst","Product Manager"};
			return availableJobs;
		}else if(companyName == "Barclays"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Data Analyst","Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","Security Analyst","DevOps Engineer","QA Engineer","Automation Engineer","Business Analyst","Wealth Manager","Portfolio Manager","Audit Analyst","Fraud Analyst","Research Analyst","Product Manager"};
			return availableJobs;
		}else if(companyName == "Citi"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Data Analyst","Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","Security Analyst","DevOps Engineer","QA Engineer","Automation Engineer","Business Analyst","Wealth Manager","Portfolio Manager","Audit Analyst","Fraud Analyst","Research Analyst","Product Manager"};
			return availableJobs;
		}else if(companyName == "Flipkart"){
			String[] availableJobs = {"E-commerce Analyst","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Logistics Analyst","Operations Manager","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Swiggy"){
			String[] availableJobs = {"Delivery Systems Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Logistics Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Zomato"){
			String[] availableJobs = {"Food Delivery Analyst","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Logistics Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Ola"){
			String[] availableJobs = {"Ride Systems Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Fleet Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
		return availableJobs;
		}else if(companyName == "Paytm"){
			String[] availableJobs = {"Payment Systems Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Fraud Analyst","Risk Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Byju's"){
			String[] availableJobs = {"EdTech Developer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Content Developer","Academic Specialist","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "PhonePe"){
			String[] availableJobs = {"Payment App Developer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Fraud Analyst","Risk Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Razorpay"){
			String[] availableJobs = {"Payment Gateway Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Fraud Analyst","Risk Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Freshworks"){
			String[] availableJobs = {"SaaS Developer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Customer Success Engineer","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer","Integration Engineer"};
			return availableJobs;
		}else if(companyName == "Zoho"){
			String[] availableJobs = {"CRM Developer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer","Integration Engineer","System Engineer"};
			return availableJobs;
		}else if(companyName == "Nykaa"){
			String[] availableJobs = {"E-commerce Developer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Catalog Manager","Operations Manager","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Meesho"){
			String[] availableJobs = {"Marketplace Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Seller Support Specialist","Operations Manager","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "CRED"){
			String[] availableJobs = {"Fintech Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Fraud Analyst","Risk Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Dream11"){
			String[] availableJobs = {"Gaming Backend Engineer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Sports Data Analyst","Performance Engineer","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer","Game Designer"};
			return availableJobs;
		}else if(companyName == "Unacademy"){
			String[] availableJobs = {"EdTech Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Content Strategist","Academic Specialist","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer","Integration Engineer"};
			return availableJobs;
		}else if(companyName == "UpGrad"){
			String[] availableJobs = {"Learning Platform Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Course Manager","Academic Advisor","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Vedantu"){
			String[] availableJobs = {"Live Class Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Teacher Support Specialist","Content Developer","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "BigBasket"){
			String[] availableJobs = {"Supply Chain Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Inventory Analyst","Operations Manager","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Delhivery"){
			String[] availableJobs = {"Logistics Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Route Optimization Analyst","Operations Manager","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "PolicyBazaar"){
			String[] availableJobs = {"Insurance Platform Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Policy Analyst","Risk Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Samsung"){
			String[] availableJobs = {"Electronics Engineer","Android Developer","Firmware Engineer","Hardware Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Display Engineer","Chip Designer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer"};
			return availableJobs;
		}else if(companyName == "Sony"){
			String[] availableJobs = {"Media Systems Engineer","Game Developer","Frontend Developer","Backend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Audio Engineer","Video Engineer","Support Engineer","Analytics Engineer","Platform Engineer","Test Engineer"};
			return availableJobs;
		}else if(companyName == "LG"){
			String[] availableJobs = {"Electronics Engineer","Hardware Engineer","Firmware Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Display Engineer","Appliance Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","System Engineer"};
			return availableJobs;
		}else if(companyName == "Panasonic"){
			String[] availableJobs = {"Electronics Engineer","Hardware Engineer","Firmware Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Battery Engineer","IoT Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","System Engineer"};
			return availableJobs;
		}else if(companyName == "Siemens"){
			String[] availableJobs = {"Industrial Engineer","Automation Engineer","PLC Developer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","System Engineer","Business Analyst","UX Designer","Electrical Engineer","Mechanical Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Control Systems Engineer"};
			return availableJobs;
		}else if(companyName == "Bosch"){
			String[] availableJobs = {"Automotive Engineer","Embedded Engineer","Firmware Engineer","Hardware Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","IoT Engineer","Mechanical Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","System Engineer"};
			return availableJobs;
		}else if(companyName == "Hitachi"){
			String[] availableJobs = {"Industrial Systems Engineer","Embedded Engineer","Firmware Engineer","Hardware Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Electrical Engineer","Mechanical Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","System Engineer"};
			return availableJobs;
		}else if(companyName == "Philips"){
			String[] availableJobs = {"Healthcare Systems Engineer","Biomedical Engineer","Embedded Engineer","Firmware Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Medical Device Engineer","IoT Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","System Engineer"};
			return availableJobs;
		}else if(companyName == "Dell"){
			String[] availableJobs = {"System Engineer","Hardware Engineer","Firmware Engineer","Embedded Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Center Engineer","Network Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Storage Engineer"};
			return availableJobs;
		}else if(companyName == "HP"){
			String[] availableJobs = {"Printer Systems Engineer","Hardware Engineer","Firmware Engineer","Embedded Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","3D Printing Engineer","Network Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Storage Engineer"};
			return availableJobs;
		}else if(companyName == "Cisco"){
			String[] availableJobs = {"Network Engineer","Security Engineer","Cloud Engineer","DevOps Engineer","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Site Reliability Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "VMware"){
			String[] availableJobs = {"Virtualization Engineer","Cloud Engineer","DevOps Engineer","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Site Reliability Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Infrastructure Engineer"};
			return availableJobs;
		}else if(companyName == "ServiceNow"){
			String[] availableJobs = {"Platform Engineer","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Integration Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","AI Engineer","Data Analyst","System Engineer","Workflow Developer"};
			return availableJobs;
		}else if(companyName == "Snowflake"){
			String[] availableJobs = {"Data Engineer","Cloud Engineer","Backend Developer","Frontend Developer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Analytics Engineer","Performance Engineer","Test Engineer","AI Engineer","Data Scientist","Platform Engineer","Support Engineer","Integration Engineer","Database Engineer"};
			return availableJobs;
		}else if(companyName == "Databricks"){
			String[] availableJobs = {"Data Engineer","Data Scientist","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Analytics Engineer","Performance Engineer","Test Engineer","AI Engineer","Machine Learning Engineer","Platform Engineer","Support Engineer","Integration Engineer"};
			return availableJobs;
		}else if(companyName == "Palantir"){
			String[] availableJobs = {"Data Engineer","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Analytics Engineer","Performance Engineer","Test Engineer","AI Engineer","Data Scientist","Platform Engineer","Support Engineer","Integration Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "Nvidia"){
			String[] availableJobs = {"GPU Engineer","AI Engineer","Machine Learning Engineer","Hardware Engineer","Firmware Engineer","Embedded Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Graphics Engineer","Data Scientist","Performance Engineer","Test Engineer","Platform Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "AMD"){
			String[] availableJobs = {"Processor Engineer","Hardware Engineer","Firmware Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Graphics Engineer","Data Scientist","Performance Engineer","Test Engineer","Platform Engineer","Systems Engineer","Chip Design Engineer"};
			return availableJobs;
		}else if(companyName == "Qualcomm"){
			String[] availableJobs = {"Chip Design Engineer","Hardware Engineer","Firmware Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Wireless Engineer","Data Scientist","Performance Engineer","Test Engineer","Platform Engineer","Systems Engineer","5G Engineer"};
			return availableJobs;
		}else if(companyName == "Broadcom"){
			String[] availableJobs = {"Semiconductor Engineer","Hardware Engineer","Firmware Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Network Engineer","Data Scientist","Performance Engineer","Test Engineer","Platform Engineer","Systems Engineer","Chip Architect"};
			return availableJobs;
		}else if(companyName == "SpaceX"){
			String[] availableJobs = {"Aerospace Engineer","Rocket Propulsion Engineer","Avionics Engineer","Embedded Systems Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Flight Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Mission Control Engineer"};
			return availableJobs;
		}else if(companyName == "Blue Origin"){
			String[] availableJobs = {"Aerospace Engineer","Rocket Systems Engineer","Avionics Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Flight Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Mission Analyst"};
			return availableJobs;
		}else if(companyName == "Boeing"){
			String[] availableJobs = {"Aerospace Engineer","Structural Engineer","Avionics Engineer","Embedded Systems Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Flight Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Maintenance Engineer"};
			return availableJobs;
		}else if(companyName == "Airbus"){
			String[] availableJobs = {"Aerospace Engineer","Structural Engineer","Avionics Engineer","Embedded Systems Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Flight Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Design Engineer"};
			return availableJobs;
		}else if(companyName == "Lockheed Martin"){
			String[] availableJobs = {"Defense Systems Engineer","Aerospace Engineer","Avionics Engineer","Embedded Systems Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Flight Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Cybersecurity Specialist"};
			return availableJobs;
		}else if(companyName == "Raytheon"){
			String[] availableJobs = {"Defense Engineer","Radar Systems Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Signal Processing Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Cybersecurity Analyst","Electronics Engineer"};
			return availableJobs;
		}else if(companyName == "Northrop Grumman"){
			String[] availableJobs = {"Aerospace Engineer","Defense Systems Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Flight Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Cybersecurity Engineer","Avionics Engineer"};
			return availableJobs;
		}else if(companyName == "General Electric"){
			String[] availableJobs = {"Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Energy Systems Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Industrial Engineer","Maintenance Engineer"};
			return availableJobs;
		}else if(companyName == "Honeywell"){
			String[] availableJobs = {"Automation Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Business Analyst","UX Designer","Industrial Engineer","Control Systems Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Aerospace Engineer","Electronics Engineer","Maintenance Engineer"};
			return availableJobs;
		}else if(companyName == "3M"){
			String[] availableJobs = {"Product Engineer","Chemical Engineer","Materials Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Manufacturing Engineer","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Research Scientist","Support Engineer","Process Engineer","Industrial Engineer"};
			return availableJobs;
		}else if(companyName == "Ford"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "General Motors"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "Toyota"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "Honda"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "BMW"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "Mercedes-Benz"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "Volkswagen"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "Hyundai"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "Kia"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "Ferrari"){
			String[] availableJobs = {"Performance Engineer","Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Race Engineer"};
			return availableJobs;
		}else if(companyName == "Coca-Cola"){
			String[] availableJobs = {"Production Engineer","Supply Chain Analyst","Quality Engineer","Food Technologist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Marketing Analyst","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager","Process Engineer"};
			return availableJobs;
		}else if(companyName == "PepsiCo"){
			String[] availableJobs = {"Production Engineer","Supply Chain Analyst","Quality Engineer","Food Technologist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Marketing Analyst","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager","Process Engineer"};
			return availableJobs;
		}else if(companyName == "Nestle"){
			String[] availableJobs = {"Food Technologist","Production Engineer","Quality Engineer","Supply Chain Analyst","Packaging Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Marketing Analyst","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager"};
			return availableJobs;
		}else if(companyName == "Unilever"){
			String[] availableJobs = {"Product Engineer","Supply Chain Analyst","Quality Engineer","Packaging Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Marketing Analyst","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager","Process Engineer"};
			return availableJobs;
		}else if(companyName == "P&G"){
			String[] availableJobs = {"Product Engineer","Supply Chain Analyst","Quality Engineer","Packaging Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Marketing Analyst","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager","Process Engineer"};
			return availableJobs;
		}else if(companyName == "Colgate-Palmolive"){
			String[] availableJobs = {"Product Engineer","Chemical Engineer","Quality Engineer","Supply Chain Analyst","Packaging Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Marketing Analyst","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager"};
			return availableJobs;
		}else if(companyName == "Johnson & Johnson"){
			String[] availableJobs = {"Biomedical Engineer","Clinical Research Analyst","Quality Engineer","Supply Chain Analyst","Packaging Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager","Regulatory Specialist"};
			return availableJobs;
		}else if(companyName == "L'Oréal"){
			String[] availableJobs = {"Cosmetic Scientist","Product Developer","Quality Engineer","Supply Chain Analyst","Packaging Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Marketing Analyst","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager"};
			return availableJobs;
		}else if(companyName == "Reckitt"){
			String[] availableJobs = {"Product Engineer","Chemical Engineer","Quality Engineer","Supply Chain Analyst","Packaging Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Marketing Analyst","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager"};
			return availableJobs;
		}else if(companyName == "Danone"){
			String[] availableJobs = {"Food Technologist","Production Engineer","Quality Engineer","Supply Chain Analyst","Packaging Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Marketing Analyst","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager"};
			return availableJobs;
		}else if(companyName == "Walmart"){
			String[] availableJobs = {"Retail Analyst","Supply Chain Analyst","Backend Developer","Frontend Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Inventory Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Costco"){
			String[] availableJobs = {"Retail Analyst","Supply Chain Analyst","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Inventory Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Target"){
			String[] availableJobs = {"Retail Analyst","Supply Chain Analyst","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Inventory Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "IKEA"){
			String[] availableJobs = {"Retail Operations Manager","Supply Chain Analyst","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Logistics Manager","Inventory Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Home Depot"){
			String[] availableJobs = {"Retail Analyst","Supply Chain Analyst","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Inventory Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Lowe's"){
			String[] availableJobs = {"Retail Analyst","Supply Chain Analyst","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Inventory Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Best Buy"){
			String[] availableJobs = {"Retail Analyst","Tech Support Engineer","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Inventory Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Walgreens"){
			String[] availableJobs = {"Healthcare Analyst","Pharmacy Systems Engineer","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Inventory Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "CVS Health"){
			String[] availableJobs = {"Healthcare Analyst","Pharmacy Systems Engineer","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Inventory Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Tesco"){
			String[] availableJobs = {"Retail Analyst","Supply Chain Analyst","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Inventory Analyst","Support Engineer","Analytics Engineer","Growth Manager","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Reliance Industries"){
			String[] availableJobs = {"Petroleum Engineer","Chemical Engineer","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Supply Chain Analyst","Support Engineer","Analytics Engineer","Growth Manager","Process Engineer"};
			return availableJobs;
		}else if(companyName == "Adani Group"){
			String[] availableJobs = {"Energy Systems Engineer","Civil Engineer","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Operations Manager","Logistics Analyst","Support Engineer","Analytics Engineer","Growth Manager","Infrastructure Engineer"};
			return availableJobs;
		}else if(companyName == "Tata Motors"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "Tata Steel"){
			String[] availableJobs = {"Metallurgical Engineer","Mechanical Engineer","Production Engineer","Quality Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Process Engineer","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager","Industrial Engineer"};
			return availableJobs;
		}else if(companyName == "Tata Consultancy Services"){
			String[] availableJobs = {"Software Engineer","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","QA Engineer","Automation Tester","Business Analyst","Support Engineer","System Administrator","Network Engineer","Security Analyst","Data Analyst","AI Engineer","Database Administrator","Mobile Developer","Project Manager","Technical Lead","Integration Engineer","Product Engineer"};
			return availableJobs;
		}else if(companyName == "Mahindra"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "Maruti Suzuki"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "Bajaj"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "Hero MotoCorp"){
			String[] availableJobs = {"Automotive Engineer","Mechanical Engineer","Electrical Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Vehicle Software Engineer","Data Engineer","Performance Engineer","Test Engineer","Simulation Engineer","Systems Engineer","Manufacturing Engineer"};
			return availableJobs;
		}else if(companyName == "ITC"){
			String[] availableJobs = {"Supply Chain Analyst","Production Engineer","Quality Engineer","Packaging Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Marketing Analyst","Data Analyst","Performance Engineer","Test Engineer","Systems Engineer","Operations Manager","Process Engineer"};
			return availableJobs;
		}else if(companyName == "Infosys BPM"){
			String[] availableJobs = {"Process Analyst","Business Analyst","Backend Developer","Frontend Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Support Engineer","UX Designer","Operations Manager","Analytics Engineer","Performance Engineer","Test Engineer","System Engineer","Integration Engineer"};
			return availableJobs;
		}else if(companyName == "HDFC Bank"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Analyst","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "ICICI Bank"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Analyst","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "Axis Bank"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Analyst","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "Kotak Mahindra Bank"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Analyst","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "State Bank of India"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Analyst","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "Bank of Baroda"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Analyst","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "Yes Bank"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Analyst","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "IndusInd Bank"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Analyst","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "IDFC First Bank"){
			String[] availableJobs = {"Banking Analyst","Financial Analyst","Risk Analyst","Compliance Analyst","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Analyst","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "ByteDance"){
			String[] availableJobs = {"Recommendation Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Content Strategist","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Growth Engineer"};
			return availableJobs;
		}else if(companyName == "Tencent"){
			String[] availableJobs = {"Game Developer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Content Strategist","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Growth Engineer"};
			return availableJobs;
		}else if(companyName == "Alibaba"){
			String[] availableJobs = {"E-commerce Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Logistics Analyst","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Growth Engineer"};
			return availableJobs;
		}else if(companyName == "Baidu"){
			String[] availableJobs = {"Search Engineer","AI Engineer","Machine Learning Engineer","Backend Developer","Frontend Developer","Data Scientist","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","NLP Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Research Scientist"};
			return availableJobs;
		}else if(companyName == "JD.com"){
			String[] availableJobs = {"E-commerce Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Logistics Analyst","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Operations Manager"};
			return availableJobs;
		}else if(companyName == "Xiaomi"){
			String[] availableJobs = {"Android Developer","Firmware Engineer","Embedded Engineer","Hardware Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","IoT Engineer","Data Analyst","Performance Engineer","Test Engineer","Platform Engineer","Systems Engineer","Mobile Engineer"};
			return availableJobs;
		}else if(companyName == "Huawei"){
			String[] availableJobs = {"Telecom Engineer","5G Engineer","Network Engineer","Embedded Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Hardware Engineer","Data Analyst","Performance Engineer","Test Engineer","Platform Engineer","Systems Engineer","Firmware Engineer"};
			return availableJobs;
		}else if(companyName == "Lenovo"){
			String[] availableJobs = {"Hardware Engineer","Firmware Engineer","Embedded Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Data Analyst","Performance Engineer","Test Engineer","Platform Engineer","Systems Engineer","Support Engineer","Network Engineer","Storage Engineer","IT Engineer"};
			return availableJobs;
		}else if(companyName == "Oppo"){
			String[] availableJobs = {"Mobile Engineer","Android Developer","Firmware Engineer","Embedded Engineer","Hardware Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Camera Engineer","Data Analyst","Performance Engineer","Test Engineer","Platform Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "Vivo"){
			String[] availableJobs = {"Mobile Engineer","Android Developer","Firmware Engineer","Embedded Engineer","Hardware Engineer","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Camera Engineer","Data Analyst","Performance Engineer","Test Engineer","Platform Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "Grab"){
			String[] availableJobs = {"Ride Systems Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Logistics Analyst","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Growth Engineer"};
			return availableJobs;
		}else if(companyName == "Gojek"){
			String[] availableJobs = {"Super App Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Logistics Analyst","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Growth Engineer"};
			return availableJobs;
		}else if(companyName == "Shopee"){
			String[] availableJobs = {"E-commerce Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Logistics Analyst","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Growth Engineer"};
			return availableJobs;
		}else if(companyName == "Lazada"){
			String[] availableJobs = {"E-commerce Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Logistics Analyst","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Operations Manager"};
			return availableJobs;
		}else if(companyName == "Sea Group"){
			String[] availableJobs = {"Platform Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Game Developer","Analytics Engineer","Performance Engineer","Test Engineer","Growth Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "Rakuten"){
			String[] availableJobs = {"E-commerce Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Marketing Analyst","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Operations Manager"};
			return availableJobs;
		}else if(companyName == "SoftBank"){
			String[] availableJobs = {"Telecom Engineer","Network Engineer","Backend Developer","Frontend Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Investment Analyst","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "Naver"){
			String[] availableJobs = {"Search Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Content Strategist","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Growth Engineer"};
			return availableJobs;
		}else if(companyName == "Kakao"){
			String[] availableJobs = {"Messaging Platform Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Content Strategist","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Growth Engineer"};
			return availableJobs;
		}else if(companyName == "LINE"){
			String[] availableJobs = {"Messaging App Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Scientist","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Content Strategist","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Growth Engineer"};
			return availableJobs;
		}else if(companyName == "Atlassian"){
			String[] availableJobs = {"Jira Developer","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Integration Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","AI Engineer","Data Analyst","Platform Engineer","Systems Engineer"};
			return availableJobs;
		}else if(companyName == "Canva"){
			String[] availableJobs = {"UI Designer","Frontend Developer","Backend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Graphics Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Growth Engineer"};
			return availableJobs;
		}else if(companyName == "Shopify"){
			String[] availableJobs = {"E-commerce Platform Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Merchant Success Manager","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Growth Engineer"};
			return availableJobs;
		}else if(companyName == "Square"){
			String[] availableJobs = {"Payment Systems Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Fraud Analyst","Risk Analyst","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer"};
			return availableJobs;
		}else if(companyName == "Zoom"){
			String[] availableJobs = {"Video Streaming Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Network Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Support Engineer"};
			return availableJobs;
		}else if(companyName == "Slack"){
			String[] availableJobs = {"Messaging Platform Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Integration Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Support Engineer"};
			return availableJobs;
		}else if(companyName == "Dropbox"){
			String[] availableJobs = {"Storage Systems Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Sync Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Support Engineer"};
			return availableJobs;
		}else if(companyName == "Asana"){
			String[] availableJobs = {"Project Management Tool Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Workflow Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Support Engineer"};
			return availableJobs;
		}else if(companyName == "Notion"){
			String[] availableJobs = {"Productivity Tool Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Content Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Support Engineer"};
			return availableJobs;
		}else if(companyName == "Figma"){
			String[] availableJobs = {"Design Tool Engineer","Frontend Developer","Backend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Graphics Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Support Engineer"};
			return availableJobs;
		}else if(companyName == "GitHub"){
			String[] availableJobs = {"Platform Engineer","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Integration Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","AI Engineer","Data Analyst","Systems Engineer","Developer Advocate"};
			return availableJobs;
		}else if(companyName == "GitLab"){
			String[] availableJobs = {"DevOps Platform Engineer","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Integration Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","AI Engineer","Data Analyst","Systems Engineer","Release Engineer"};
			return availableJobs;
		}else if(companyName == "Cloudflare"){
			String[] availableJobs = {"Network Security Engineer","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Site Reliability Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","AI Engineer","Data Analyst","Systems Engineer","Edge Engineer"};
			return availableJobs;
		}else if(companyName == "Fastly"){
			String[] availableJobs = {"Edge Cloud Engineer","Backend Developer","Frontend Developer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Site Reliability Engineer","Support Engineer","Analytics Engineer","Performance Engineer","Test Engineer","AI Engineer","Data Analyst","Systems Engineer","Network Engineer"};
			return availableJobs;
		}else if(companyName == "Twilio"){
			String[] availableJobs = {"Communication API Engineer","Backend Developer","Frontend Developer","Mobile Developer","Data Analyst","AI Engineer","Cloud Engineer","DevOps Engineer","Security Engineer","Product Manager","QA Engineer","Automation Engineer","Business Analyst","UX Designer","Integration Engineer","Analytics Engineer","Performance Engineer","Test Engineer","Platform Engineer","Support Engineer"};
			return availableJobs;
		}
		
		return null;
	}
	
	
	
	public static void getAvailableJobs(String[] jobNames){
		for(String jobName : jobNames){
			System.out.println(jobName);
		}
	}

}