class Country {
	static String[] fingStateByCountry(String countryName){
		System.out.println("The Invoking fingStateByCountry method....");
		if(countryName == "Afghanistan"){
			String[] states = {"Badakhshan","Badghis","Baghlan","Balkh","Bamyan","Daykundi","Farah","Faryab","Ghazni","Ghor","Helmand","Herat","Jowzjan","Kabul","Kandahar","Kapisa","Khost","Kunar","Kunduz","Laghman","Logar","Nangarhar","Nimruz","Nuristan","Paktia","Paktika","Panjshir","Parwan","Samangan","Sar-e Pol","Takhar","Uruzgan","Wardak","Zabul"};
			return states;
		}else if(countryName == "Albania"){
			String[] states = {"Berat","Diber","Durres","Elbasan","Fier","Gjirokaster","Korce","Kukes","Lezhe","Shkoder","Tirane","Vlore"};
			return states;
		}else if(countryName =="Algeria"){
				String[] states = {"Adrar", "Chlef", "Laghouat", "Oum El Bouaghi", "Batna", "Béjaïa", "Biskra", "Béchar", "Blida", "Bouïra", "Tamanrasset", "Tébessa", "Tlemcen", "Tiaret", "Tizi Ouzou", "Algiers", "Djelfa", "Jijel", "Sétif", "Saïda", "Skikda", "Sidi Bel Abbès", "Annaba", "Guelma", "Constantine", "Médéa", "Mostaganem", "M'Sila", "Mascara", "Ouargla", "Oran", "El Bayadh", "Illizi", "Bordj Bou Arréridj", "Boumerdès", "El Tarf", "Tindouf", "Tissemsilt", "El Oued", "Khenchela", "Souk Ahras", "Tipaza", "Mila", "Aïn Defla", "Naâma", "Aïn Témouchent", "Ghardaïa", "Relizane", "Timimoun", "Bordj Badji Mokhtar", "Ouled Djellal", "Béni Abbès", "In Salah", "In Guezzam", "Touggourt", "Djanet", "El M'Ghair", "El Meniaa", "Aflou", "Barika", "Ksar Chellala", "Messaad", "Aïn Oussera", "Boussaâda", "El Abiodh Sidi Cheikh", "El Kantara", "Bir El Ater", "Ksar El Boukhari", "El Aricha"};
			return states;
		}else if(countryName =="Andorra"){
				String[] states = {"Andorra la Vella", "Canillo", "Encamp", "Escaldes-Engordany", "La Massana", "Ordino", "Sant Julià de Lòria"};
			return states;
		}else if(countryName =="Angola"){
			String[] states = {"Bengo", "Benguela", "Bié", "Cabinda", "Cuando", "Cuanza Norte", "Cuanza Sul", "Cubango", "Cunene", "Huambo", "Huíla", "Icolo e Bengo", "Luanda", "Lunda Norte", "Lunda Sul", "Malanje", "Moxico", "Moxico Leste", "Namibe", "Uíge", "Zaire"};
			return states;
		}else if(countryName =="Antigua"){
			String[] states = {"Saint George", "Saint John", "Saint Mary", "Saint Paul", "Saint Peter", "Saint Philip", "Barbuda", "Redonda"};
			return states;
		}else if(countryName =="Argentina"){
			String[] states = {"Buenos Aires", "Catamarca", "Chaco", "Chubut", "Ciudad Autónoma de Buenos Aires", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego, Antártida e Islas del Atlántico Sur", "Tucumán"};
			return states;
		}else if(countryName =="Armenia"){
			String[] states = {"Aragatsotn", "Ararat", "Armavir", "Gegharkunik", "Kotayk", "Lori", "Shirak", "Syunik", "Tavush", "Vayots Dzor", "Yerevan"};
			return states;
		}else if(countryName =="Australia"){
			String[] states = {"Australian Capital Territory", "New South Wales", "Northern Territory", "Queensland", "South Australia", "Tasmania", "Victoria", "Western Australia"};
			return states;
		}else if(countryName =="Austria"){
			String[] states = {"Burgenland", "Carinthia", "Lower Austria", "Salzburg", "Styria", "Tyrol", "Upper Austria", "Vienna", "Vorarlberg"};
			return states;
		}else if(countryName =="Azerbaijan"){
			String[] states = {"Absheron", "Aghjabadi", "Aghdam", "Agdash", "Aghstafa", "Agsu", "Astara", "Babek", "Baku", "Balakan", "Barda", "Beylagan", "Bilasuvar", "Dashkasan", "Fuzuli", "Gadabay", "Ganja", "Gobustan", "Goranboy", "Goychay", "Goygol", "Hajigabul", "Imishli", "Ismayilli", "Jabrayil", "Jalilabad", "Julfa", "Kalbajar", "Kangarli", "Khachmaz", "Khankendi", "Khizi", "Khojaly", "Khojavend", "Kurdamir", "Lachin", "Lankaran", "Lerik", "Masally", "Mingachevir", "Naftalan", "Nakhchivan", "Neftchala", "Oghuz", "Ordubad", "Qabala", "Qakh", "Qazakh", "Quba", "Qubadli", "Qusar", "Saatly", "Sabirabad", "Sadarak", "Salyan", "Samukh", "Shabran", "Shahbuz", "Shaki", "Shamakhi", "Shamkir", "Sharur", "Shirvan", "Shusha", "Siyazan", "Sumgait", "Tartar", "Tovuz", "Ujar", "Yardimli", "Yevlakh", "Zagatala", "Zangilan", "Zardab"};
			return states;
		}else if(countryName =="Bahamas"){
			String[] states = {"Acklins", "Berry Islands", "Bimini", "Black Point (Exuma Cays)", "Cat Island", "Central Abaco", "Central Andros", "Central Eleuthera", "City of Freeport", "Crooked Island & Long Cay", "East Grand Bahama", "Exuma", "Grand Cay", "Great Abaco Cays (Hope Town)", "Green Turtle Cay", "Harbour Island", "Inagua", "Long Island", "Mangrove Cay", "Mayaguana", "Moore's Island", "New Providence (Capital Area)", "North Abaco", "North Andros", "North Eleuthera", "Ragged Island", "Rum Cay", "San Salvador", "South Abaco", "South Andros", "South Eleuthera", "Spanish Wells", "Sweeting's Cay", "West Grand Bahama"};
			return states;
		}else if(countryName =="Bahrain"){
			String[] states = {"Capital Governorate", "Muharraq Governorate", "Northern Governorate", "Southern Governorate"};
			return states;
		}else if(countryName =="Bangladesh"){
			String[] states = {"Bagerhat", "Bandarban", "Barguna", "Barishal", "Bhola", "Bogra", "Brahmanbaria", "Chandpur", "Chattogram", "Chuadanga", "Cox's Bazar", "Cumilla", "Dhaka", "Dinajpur", "Faridpur", "Feni", "Gaibandha", "Gazipur", "Gopalganj", "Habiganj", "Jamalpur", "Jashore", "Jhalokati", "Jhenaidah", "Joypurhat", "Khagrachari", "Khulna", "Kishoreganj", "Kurigram", "Kushtia", "Lakshmipur", "Lalmonirhat", "Madaripur", "Magura", "Manikganj", "Meherpur", "Moulvibazar", "Munshiganj", "Mymensingh", "Naogaon", "Narail", "Narayanganj", "Narsingdi", "Natore", "Netrokona", "Nilphamari", "Noakhali", "Pabna", "Panchagarh", "Patuakhali", "Pirojpur", "Rajbari", "Rajshahi", "Rangamati", "Rangpur", "Satkhira", "Shariatpur", "Sherpur", "Sirajganj", "Sunamganj", "Sylhet", "Tangail", "Thakurgaon" };
			return states;
		}else if(countryName =="Barbados"){
			String[] states = {"Christ Church", "Saint Andrew", "Saint George", "Saint James", "Saint John", "Saint Joseph", "Saint Lucy", "Saint Michael", "Saint Peter", "Saint Philip", "Saint Thomas"};
			return states;
		}else if(countryName =="Belarus"){
			String[] states = {"Brest", "Gomel", "Grodno", "Minsk", "Minsk City", "Mogilev", "Vitebsk"};
			return states;
		}else if(countryName =="Belgium"){
			String[] states = {"Antwerp", "East Flanders", "Flemish Brabant", "Hainaut", "Liège", "Limburg", "Luxembourg", "Namur", "Walloon Brabant", "West Flanders", "Brussels-Capital Region"};
			return states;
		}else if(countryName =="Belize"){
			String[] states = {"Belize", "Cayo", "Corozal", "Orange Walk", "Stann Creek", "Toledo"};
			return states;
		}else if(countryName =="Benin"){
			String[] states = {"Alibori", "Atakora", "Atlantique", "Borgou", "Collines", "Donga", "Kouffo", "Littoral", "Mono", "Ouémé", "Plateau", "Zou"};
			return states;
		}else if(countryName =="Bhutan"){
			String[] states = {"Bumthang", "Chukha", "Dagana", "Gasa", "Haa", "Lhuentse", "Mongar", "Paro", "Pemagatshel", "Punakha", "Samdrup Jongkhar", "Samtse", "Sarpang", "Thimphu", "Trashigang", "Trashiyangtse", "Trongsa", "Tsirang", "Wangdue Phodrang", "Zhemgang"};
			return states;
		}else if(countryName =="Bolivia"){
			String[] states = {"Beni", "Chuquisaca", "Cochabamba", "La Paz", "Oruro", "Pando", "Potosí", "Santa Cruz", "Tarija"};
			return states;
		}else if(countryName =="Bosnia"){
			String[] states = {"Una-Sana", "Posavina", "Tuzla", "Zenica-Doboj", "Bosnian-Podrinje Goražde", "Central Bosnia", "Herzegovina-Neretva", "West Herzegovina", "Sarajevo", "Canton 10 (Hercegbosna)"};
			return states;
		}else if(countryName =="Botswana"){
			String[] states = {"Central", "Chobe", "Francistown", "Gaborone", "Ghanzi", "Jwaneng", "Kgalagadi", "Kgatleng", "Kweneng", "Lobatse", "North-East", "North-West", "Selebi-Phikwe", "South-East", "Southern", "Sowa Town"};
			return states;
		}else if(countryName =="Brazil"){
			String[] states = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};
			return states;
		}else if(countryName =="Brunei"){
			String[] states = {"Belait", "Brunei-Muara", "Temburong", "Tutong"};
			return states;
		}else if(countryName =="Bulgaria"){
			String[] states = {"Blagoevgrad", "Burgas", "Dobrich", "Gabrovo", "Haskovo", "Kardzhali", "Kyustendil", "Lovech", "Montana", "Pazardzhik", "Pernik", "Pleven", "Plovdiv", "Razgrad", "Ruse", "Shumen", "Silistra", "Sliven", "Smolyan", "Sofia City", "Sofia", "Stara Zagora", "Targovishte", "Varna", "Veliko Tarnovo", "Vidin", "Vratsa", "Yambol"};
			return states;
		}else if(countryName =="Burkina Faso"){
			String[] states = {"Boucle du Mouhoun", "Cascades", "Centre", "Centre-Est", "Centre-Nord", "Centre-Ouest", "Centre-Sud", "Est", "Hauts-Bassins", "Nord", "Plateau-Central", "Sahel", "Sud-Ouest", "Sum", "Serba", "Tapoa", "Suru"};
			return states;
		}else if(countryName =="Burundi"){
			String[] states = {"Buhumuza", "Bujumbura", "Burunga", "Butanyerera", "Gitega"};
			return states;
		}else if(countryName =="Cabo Verde"){
			String[] states = {"Boa Vista", "Brava", "Maio", "Mosteiros", "Paul", "Porto Novo", "Praia", "Ribeira Brava", "Ribeira Grande", "Ribeira Grande de Santiago", "Sal", "Santa Catarina", "Santa Catarina do Fogo", "Santa Cruz", "São Domingos", "São Filipe", "São Lourenço dos Órgãos", "São Miguel", "São Salvador do Mundo", "São Vicente", "Tarrafal", "Tarrafal de São Nicolau"};
			return states;
		}else if(countryName =="Cambodia"){
			String[] states = {"Banteay Meanchey", "Battambang", "Kampong Cham", "Kampong Chhnang", "Kampong Speu", "Kampong Thom", "Kampot", "Kandal", "Kep", "Koh Kong", "Kratie", "Mondulkiri", "Odder Meanchey", "Pailin", "Phnom Penh", "Preah Sihanouk", "Preah Vihear", "Prey Veng", "Pursat", "Ratanakiri", "Siem Reap", "Stung Treng", "Svay Rieng", "Takeo", "Tbong Khmum"};
			return states;
		}else if(countryName =="Cameroon"){
			String[] states = {"Adamaoua", "Centre", "East", "Far North", "Littoral", "North", "North-West", "South", "South-West", "West"};
			return states;
		}else if(countryName =="Canada"){
			String[] states = {"Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador", "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan", "Yukon"};
			return states;
		}else if(countryName =="Central African Republic"){
			String[] states = {"Bamingui-Bangoran", "Bangui", "Basse-Kotto", "Haute-Kotto", "Haut-Mbomou", "Kémo", "Lim-Pendé", "Lobaye", "Mambéré", "Mambéré-Kadéï", "Mbomou", "Nana-Grébizi", "Nana-Mambéré", "Ombella-M'Poko", "Ouaka", "Ouham", "Ouham-Fafa", "Ouham-Pendé", "Sangha-Mbaéré", "Vakaga"};
			return states;
		}else if(countryName =="Chad"){
			String[] states = {"Bahr el Gazel", "Batha", "Borkou", "Chari-Baguirmi", "Ennedi-Est", "Ennedi-Ouest", "Guéra", "Hadjer-Lamis", "Kanem", "Lac", "Logone Occidental", "Logone Oriental", "Mandoul", "Mayo-Kebbi Est", "Mayo-Kebbi Ouest", "Moyen-Chari", "N'Djamena", "Ouaddaï", "Salamat", "Sila", "Tandjilé", "Tibesti", "Wadi Fira"};
			return states;
		}else if(countryName =="Chile"){
			String[] states = {"Arica y Parinacota", "Tarapacá", "Antofagasta", "Atacama", "Coquimbo", "Valparaíso", "Metropolitana de Santiago", "Libertador General Bernardo O'Higgins", "Maule", "Ñuble", "Biobío", "Araucanía", "Los Ríos", "Los Lagos", "Aysén del General Carlos Ibáñez del Campo", "Magallanes y de la Antártica Chilena"};
			return states;
		}else if(countryName =="China"){
			String[] states = {"Anhui", "Beijing", "Chongqing", "Fujian", "Gansu", "Guangdong", "Guangxi", "Guizhou", "Hainan", "Hebei", "Heilongjiang", "Henan", "Hubei", "Hunan", "Inner Mongolia", "Jiangsu", "Jiangxi", "Jilin", "Liaoning", "Ningxia", "Qinghai", "Shaanxi", "Shandong", "Shanghai", "Shanxi", "Sichuan", "Tianjin", "Tibet", "Xinjiang", "Yunnan", "Zhejiang"};
			return states;
		}else if(countryName =="Colombia"){
			String[] states = {"Amazonas", "Antioquia", "Arauca", "Atlántico", "Bogotá", "Bolívar", "Boyacá", "Caldas", "Caquetá", "Casanare", "Cauca", "Cesar", "Chocó", "Córdoba", "Cundinamarca", "Guainía", "Guaviare", "Huila", "La Guajira", "Magdalena", "Meta", "Nariño", "Norte de Santander", "Putumayo", "Quindío", "Risaralda", "San Andrés y Providencia", "Santander", "Sucre", "Tolima", "Valle del Cauca", "Vaupés", "Vichada"};
			return states;
		}else if(countryName =="Comoros"){
			String[] states = {"Anjouan", "Grande Comore", "Mohéli"};
			return states;
		}else if(countryName =="Congo"){
			String[] states = {"Bouenza", "Brazzaville", "Congo-Oubangui", "Cuvette", "Cuvette-Ouest", "Djoué-Léfini", "Kouilou", "Lékoumou", "Likouala", "Niari", "Nkéni-Alima", "Plateaux", "Pointe-Noire", "Pool", "Sangha"};
			return states;
		}else if(countryName =="Costa Rica"){
			String[] states = {"Alajuela", "Cartago", "Guanacaste", "Heredia", "Limón", "Puntarenas", "San José"};
			return states;
		}else if(countryName =="Côte d'Ivoire"){
			String[] states = {"Abidjan (Autonomous)", "Bas-Sassandra", "Comoé", "Denguélé", "Gôh-Djiboua", "Lacs", "Lagunes", "Montagnes", "Sassandra-Marahoué", "Savanes", "Vallée du Bandama", "Woroba", "Yamoussoukro (Autonomous)", "Zanzan"};
			return states;
		}else if(countryName =="Croatia"){
			String[] states = {"Bjelovar-Bilogora", "Brod-Posavina", "Dubrovnik-Neretva", "Istria", "Karlovac", "Koprivnica-Križevci", "Krapina-Zagorje", "Lika-Senj", "Međimurje", "Osijek-Baranja", "Požega-Slavonia", "Primorje-Gorski Kotar", "Šibenik-Knin", "Sisak-Moslavina", "Split-Dalmatia", "Varaždin", "Virovitica-Podravina", "Vukovar-Srijem", "Zadar", "Zagreb County", "City of Zagreb"};
			return states;
		}else if(countryName =="Cuba"){
			String[] states = {"Artemisa", "Camagüey", "Ciego de Ávila", "Cienfuegos", "Granma", "Guantánamo", "Holguín", "Isla de la Juventud", "La Habana", "Las Tunas", "Matanzas", "Mayabeque", "Pinar del Río", "Sancti Spíritus", "Santiago de Cuba", "Villa Clara"};
			return states;
		}else if(countryName =="Cyprus"){
			String[] states = {"Famagusta", "Kyrenia", "Larnaca", "Limassol", "Nicosia", "Paphos" };
			return states;
		}else if(countryName =="Czech Republic"){
			String[] states = {"Central Bohemia", "South Bohemia", "Plzeň", "Karlovy Vary", "Ústí nad Labem", "Liberec", "Hradec Králové", "Pardubice", "Vysočina", "South Moravia", "Olomouc", "Zlín", "Moravia-Silesia", "Prague"};
			return states;
		}else if(countryName =="Denmark"){
			String[] states = {"Capital Region of Denmark", "Central Denmark Region", "North Denmark Region", "Region of Southern Denmark", "Region Zealand"};
			return states;
		}else if(countryName =="Djibouti"){
			String[] states = {"Ali Sabieh", "Arta", "Dikhil", "Djibouti (City)", "Obock", "Tadjourah"};
			return states;
		}else if(countryName =="Dominica"){
			String[] states = {"Saint Andrew", "Saint David", "Saint George", "Saint John", "Saint Joseph", "Saint Luke", "Saint Mark", "Saint Patrick", "Saint Paul", "Saint Peter"};
			return states;
		}else if(countryName =="Dominican Republic"){
			String[] states = {"Azua", "Baoruco", "Barahona", "Dajabón", "Distrito Nacional", "Duarte", "El Seibo", "Elías Piña", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Independencia", "La Altagracia", "La Romana", "La Vega", "María Trinidad Sánchez", "Monseñor Nouel", "Monte Cristi", "Monte Plata", "Pedernales", "Peravia", "Puerto Plata", "Samaná", "San Cristóbal", "San José de Ocoa", "San Juan", "San Pedro de Macorís", "Sánchez Ramírez", "Santiago", "Santiago Rodríguez", "Santo Domingo", "Valverde"};
			return states;
		}else if(countryName =="Ecuador"){
			String[] states = {"Azuay", "Bolívar", "Cañar", "Carchi", "Chimborazo", "Cotopaxi", "El Oro", "Esmeraldas", "Galápagos", "Guayas", "Imbabura", "Loja", "Los Ríos", "Manabí", "Morona Santiago", "Napo", "Orellana", "Pastaza", "Pichincha", "Santa Elena", "Santo Domingo de los Tsáchilas", "Sucumbíos", "Tungurahua", "Zamora Chinchipe"};
			return states;
		}else if(countryName =="Egypt"){
			String[] states = {"Alexandria", "Aswan", "Asyut", "Beheira", "Beni Suef", "Cairo", "Dakahlia", "Damietta", "Faiyum", "Gharbia", "Giza", "Ismailia", "Kafr El Sheikh", "Luxor", "Matrouh", "Minya", "Monufia", "New Valley", "North Sinai", "Port Said", "Qalyubia", "Qena", "Red Sea", "Sharqia", "Sohag", "South Sinai", "Suez"};
			return states;
		}else if(countryName =="El Salvador"){
			String[] states = {"Ahuachapán", "Cabañas", "Chalatenango", "Cuscatlán", "La Libertad", "La Paz", "La Unión", "Morazán", "San Miguel", "San Salvador", "San Vicente", "Santa Ana", "Sonsonate", "Usulután"};
			return states;
		}else if(countryName =="Equatorial Guinea"){
			String[] states = {"Annobón", "Bioko Norte", "Bioko Sur", "Centro Sur", "Djibloho", "Kié-Ntem", "Litoral", "Wele-Nzas"};
			return states;
		}else if(countryName =="Eritrea"){
			String[] states = {"Anseba", "Central (Maekel)", "Gash-Barka", "Northern Red Sea (Semienawi Keyih Bahri)", "Southern (Debub)", "Southern Red Sea"};
			return states;
		}else if(countryName =="Estonia"){
			String[] states = {"Harju", "Hiiu", "Ida-Viru", "Jõgeva", "Järva", "Lääne", "Lääne-Viru", "Põlva", "Pärnu", "Rapla", "Saare", "Tartu", "Valga", "Viljandi", "Võru"};
			return states;
		}else if(countryName =="Eswatini"){
			String[] states = {"Hhohho", "Lubombo", "Manzini", "Shiselweni"};
			return states;
		}else if(countryName =="Ethiopia"){
			String[] states = {"Addis Ababa (City)", "Afar", "Amhara", "Benishangul-Gumuz", "Central Ethiopia", "Dire Dawa (City)", "Gambela", "Harari", "Oromia", "Sidama", "Somali", "South Ethiopia", "South West Ethiopia Peoples'", "Tigray"};
			return states;
		}else if(countryName =="Fiji"){
			String[] states = {"Central Division", "Eastern Division", "Northern Division", "Western Division"};
			return states;
		}else if(countryName =="Finland"){
			String[] states = {"Central Finland", "Central Ostrobothnia", "Kainuu", "Kanta-Häme", "Kymenlaakso", "Lapland", "North Karelia", "North Ostrobothnia", "North Savo", "Ostrobothnia", "Päijät-Häme", "Pirkanmaa", "Satakunta", "South Karelia", "South Ostrobothnia", "South Savo", "Southwest Finland", "Uusimaa", "Åland"};
			return states;
		}else if(countryName =="France"){
			String[] states = {"Auvergne-Rhône-Alpes", "Bourgogne-Franche-Comté", "Brittany", "Centre-Val de Loire", "Corsica", "Grand Est", "Hauts-de-France", "Île-de-France", "Normandy", "Nouvelle-Aquitaine", "Occitanie", "Pays de la Loire", "Provence-Alpes-Côte d'Azur"};
			return states;
		}else if(countryName =="Gabon"){
			String[] states = {"Estuaire", "Haut-Ogooué", "Moyen-Ogooué", "Ngounié", "Nyanga", "Ogooué-Ivindo", "Ogooué-Lolo", "Ogooué-Maritime", "Woleu-Ntem"};
			return states;
		}else if(countryName =="Gambia"){
			String[] states = {"Banjul", "Central River", "Kanifing", "Lower River", "North Bank", "Upper River", "West Coast"};
			return states;
		}else if(countryName =="Georgia"){
			String[] states = {"Abkhazia (Autonomous Republic)", "Adjara (Autonomous Republic)", "Guria", "Imereti", "Kakheti", "Kvemo Kartli", "Mtskheta-Mtianeti", "Racha-Lechkhumi and Kvemo Svaneti", "Samegrelo-Zemo Svaneti", "Samtskhe-Javakheti", "Shida Kartli", "Tbilisi (City)"};
			return states;
		}else if(countryName =="Ghana"){
			String[] states = {"Ahafo", "Ashanti", "Bono", "Bono East", "Central", "Eastern", "Greater Accra", "North East", "Northern", "Oti", "Savannah", "Upper East", "Upper West", "Volta", "Western", "Western North"};
			return states;
		}else if(countryName =="Greece"){
			String[] states = {"Attica", "Central Greece", "Central Macedonia", "Crete", "Eastern Macedonia and Thrace", "Epirus", "Ionian Islands", "North Aegean", "Peloponnese", "South Aegean", "Thessaly", "Western Greece", "Western Macedonia", "Mount Athos"};
			return states;
		}else if(countryName =="Grenada"){
			String[] states = {"Saint Andrew", "Saint David", "Saint George", "Saint John", "Saint Mark", "Saint Patrick", "Carriacou and Petite Martinique"};
			return states;
		}else if(countryName =="Guatemala"){
			String[] states = {"Alta Verapaz", "Baja Verapaz", "Chimaltenango", "Chiquimula", "El Progreso", "Escuintla", "Guatemala", "Huehuetenango", "Izabal", "Jalapa", "Jutiapa", "Petén", "Quetzaltenango", "Quiché", "Retalhuleu", "Sacatepéquez", "San Marcos", "Santa Rosa", "Sololá", "Suchitepéquez", "Totonicapán", "Zacapa"};
			return states;
		}else if(countryName =="Guinea"){
			String[] states = {"Boké", "Conakry (Special Zone)", "Faranah", "Kankan", "Kindia", "Labé", "Mamou", "Nzérékoré"};
			return states;
		}else if(countryName =="Guinea-Bissau"){
			String[] states = {"Bafatá", "Biombo", "Bissau (Autonomous Sector)", "Bolama", "Cacheu", "Gabú", "Oio", "Quinara", "Tombali"};
			return states;
		}else if(countryName =="Guyana"){
			String[] states = {"Barima-Waini", "Cuyuni-Mazaruni", "Demerara-Mahaica", "East Berbice-Corentyne", "Mahaica-Berbice", "Pomeroon-Supenaam", "Potaro-Siparuni", "Upper Demerara-Berbice", "Upper Takutu-Upper Essequibo", "Essequibo Islands-West Demerara"};
			return states;
		}else if(countryName =="Haiti"){
			String[] states = {"Artibonite", "Centre", "Grand'Anse", "Nippes", "Nord", "Nord-Est", "Nord-Ouest", "Ouest", "Sud", "Sud-Est"};
			return states;
		}else if(countryName =="Holy See"){
			String[] states = {"Vatican City"};
			return states;
		}else if(countryName =="Honduras"){
			String[] states = {"Atlántida", "Choluteca", "Colón", "Comayagua", "Copán", "Cortés", "El Paraíso", "Francisco Morazán", "Gracias a Dios", "Intibucá", "Islas de la Bahía", "La Paz", "Lempira", "Ocotepeque", "Olancho", "Santa Bárbara", "Valle", "Yoro"};
			return states;
		}else if(countryName =="Hungary"){
			String[] states = {"Bács-Kiskun", "Baranya", "Békés", "Borsod-Abaúj-Zemplén", "Budapest (Capital City)", "Csongrád-Csanád", "Fejér", "Győr-Moson-Sopron", "Hajdú-Bihar", "Heves", "Jász-Nagykun-Szolnok", "Komárom-Esztergom", "Nógrád", "Pest", "Somogy", "Szabolcs-Szatmár-Bereg", "Tolna", "Vas", "Veszprém", "Zala"};
			return states;
		}else if(countryName =="Iceland"){
			String[] states = {"Capital Region", "Southern Peninsula", "Western Region", "Westfjords", "Northwestern Region", "Northeastern Region", "Eastern Region", "Southern Region"};
			return states;
		}else if(countryName =="India"){
			String[] states = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal", "Andaman and Nicobar Islands", "Chandigarh", "Dadra and Nagar Haveli and Daman and Diu", "Delhi", "Jammu and Kashmir", "Ladakh", "Lakshadweep", "Puducherry"};
			return states;
		}else if(countryName =="Indonesia"){
			String[] states = {"Aceh", "Bali", "Banten", "Bengkulu", "Central Java", "Central Kalimantan", "Central Papua", "Central Sulawesi", "East Java", "East Kalimantan", "East Nusa Tenggara", "Gorontalo", "Highland Papua", "Jakarta", "Jambi", "Lampung", "Maluku", "North Kalimantan", "North Maluku", "North Sulawesi", "North Sumatra", "Papua", "Riau", "Riau Islands", "South Kalimantan", "South Papua", "South Sulawesi", "South Sumatra", "Southeast Sulawesi", "Southwest Papua", "Special Region of Yogyakarta", "West Java", "West Kalimantan", "West Nusa Tenggara", "West Papua", "West Sulawesi", "West Sumatra", "West Timor"};
			return states;
		}else if(countryName =="Iran"){
			String[] states = {"Alborz", "Ardabil", "Bushehr", "Chaharmahal and Bakhtiari", "East Azerbaijan", "Fars", "Gilan", "Golestan", "Hamadan", "Hormozgan", "Ilam", "Isfahan", "Kerman", "Kermanshah", "Khuzestan", "Kohgiluyeh and Boyer-Ahmad", "Kurdistan", "Lorestan", "Markazi", "Mazandaran", "North Khorasan", "Qazvin", "Qom", "Razavi Khorasan", "Semnan", "Sistan and Baluchestan", "South Khorasan", "Tehran", "West Azerbaijan", "Yazd", "Zanjan"};
			return states;
		}else if(countryName =="Iraq"){
			String[] states = {"Al-Anbar", "Babil", "Baghdad", "Basra", "Dahuk", "Dhi Qar", "Diyala", "Erbil", "Halabja", "Karbala", "Kirkuk", "Maysan", "Muthanna", "Najaf", "Nineveh", "Qadisiyah", "Salah al-Din", "Sulaymaniyah", "Wasit" };
			return states;
		}else if(countryName =="Ireland"){
			String[] states = {"Ireland","Carlow", "Cavan", "Clare", "Cork", "Donegal", "Dublin", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Longford", "Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon", "Sligo", "Tipperary", "Waterford", "Westmeath", "Wexford", "Wicklow"};
			return states;
		}else if(countryName =="Israel"){
			String[] states = {"Central District", "Haifa District", "Jerusalem District", "Northern District", "Southern District", "Tel Aviv District"};
			return states;
		}else if(countryName =="Italy"){
			String[] states = {"Abruzzo", "Aosta Valley", "Apulia", "Basilicata", "Calabria", "Campania", "Emilia-Romagna", "Friuli-Venezia Giulia", "Lazio", "Liguria", "Lombardy", "Marche", "Molise", "Piedmont", "Sardinia", "Sicily", "Tuscany", "Trentino-South Tyrol", "Umbria", "Veneto"};
			return states;
		}else if(countryName =="Jamaica"){
			String[] states = {"Clarendon", "Hanover", "Kingston", "Manchester", "Portland", "Saint Andrew", "Saint Ann", "Saint Catherine", "Saint Elizabeth", "Saint James", "Saint Mary", "Saint Thomas", "Trelawny", "Westmoreland"};
			return states;
		}else if(countryName =="Japan"){
			String[] states = {"Aichi", "Akita", "Aomori", "Chiba", "Ehime", "Fukui", "Fukuoka", "Fukushima", "Gifu", "Gunma", "Hiroshima", "Hokkaido", "Hyogo", "Ibaraki", "Ishikawa", "Iwate", "Kagawa", "Kagoshima", "Kanagawa", "Kochi", "Kumamoto", "Kyoto", "Mie", "Miyagi", "Miyazaki", "Nagano", "Nagasaki", "Nara", "Niigata", "Oita", "Okayama", "Okinawa", "Osaka", "Saga", "Saitama", "Shiga", "Shimane", "Shizuoka", "Tochigi", "Tokushima", "Tokyo", "Tottori", "Toyama", "Wakayama", "Yamagata", "Yamaguchi", "Yamanashi"};
			return states;
		}else if(countryName =="Jordan"){
			String[] states = {"Ajloun", "Aqaba", "Amman", "Balqa", "Irbid", "Jerash", "Karak", "Ma'an", "Madaba", "Mafraq", "Tafilah", "Zarqa"};
			return states;
		}else if(countryName =="Kazakhstan"){
			String[] states = {"Abai", "Akmola", "Aktobe", "Almaty", "Almaty Region", "Astana", "Atyrau", "Baikonur", "East Kazakhstan", "Jambyl", "Jetisu", "Karaganda", "Kostanay", "Kyzylorda", "Mangystau", "North Kazakhstan", "Pavlodar", "Shymkent", "Turkistan", "Ulytau", "West Kazakhstan"};
			return states;
		}else if(countryName =="Kenya"){
			String[] states = {"Baringo", "Bomet", "Bungoma", "Busia", "Elgeyo-Marakwet", "Embu", "Garissa", "Homa Bay", "Isiolo", "Kajiado", "Kakamega", "Kericho", "Kiambu", "Kilifi", "Kirinyaga", "Kisii", "Kisumu", "Kitui", "Kwale", "Laikipia", "Lamu", "Machakos", "Makueni", "Mandera", "Marsabit", "Meru", "Migori", "Mombasa", "Murang'a", "Nairobi City", "Nakuru", "Nandi", "Narok", "Nyamira", "Nyandarua", "Nyeri", "Samburu", "Siaya", "Taita-Taveta", "Tana River", "Tharaka-Nithi", "Trans Nzoia", "Turkana", "Uasin Gishu", "Vihiga", "Wajir", "West Pokot"};
			return states;
		}else if(countryName =="Kiribati"){
			String[] states = {"Abaiang", "Abemama", "Aranuka", "Arorae", "Banaba", "Beru", "Betio Town Council", "Butaritari", "Eutan Tarawa Council (North Tarawa)", "Kuria", "Maiana", "Makin", "Marakei", "Nikunau", "Nonouti", "Onotoa", "Tabiteuea North", "Tabiteuea South", "Tamana", "Teinainano Urban Council (South Tarawa)"};
			return states;
		}else if(countryName =="Kuwait"){
			String[] states = {"Al Asimah (Capital)", "Hawalli", "Farwaniya", "Mubarak Al-Kabeer", "Ahmadi", "Jahra"};
			return states;
		}else if(countryName =="Kyrgyzstan"){
			String[] states = {"Batken", "Bishkek (City)", "Chüy", "Jalal-Abad", "Naryn", "Osh", "Osh (City)", "Talas", "Ysyk-Köl"};
			return states;
		}else if(countryName =="Laos"){
			String[] states = {"Attapeu", "Bokeo", "Bolikhamxai", "Champasak", "Houaphanh", "Khammouane", "Luang Namtha", "Luang Prabang", "Oudomxay", "Phongsaly", "Salavan", "Savannakhet", "Sayaboury", "Sekong", "Vientiane Prefecture", "Vientiane Province", "Xaisomboun", "Xiangkhouang"};
			return states;
		}else if(countryName =="Latvia"){
			String[] states = {"Daugavpils", "Jelgava", "Jūrmala", "Liepāja", "Rēzekne", "Riga", "Ventspils"};
			return states;
		}else if(countryName =="Lebanon"){
			String[] states = {"Akkar", "Baalbek-Hermel", "Beirut", "Beqaa", "Keserwan-Jbeil", "Mount Lebanon", "Nabatieh", "North Lebanon", "South Lebanon"};
			return states;
		}else if(countryName =="Lesotho"){
			String[] states = {"Berea", "Butha-Buthe", "Leribe", "Mafeteng", "Maseru", "Mohale's Hoek", "Mokhotlong", "Qacha's Nek", "Quthing", "Thaba-Tseka"};
			return states;
		}else if(countryName =="Liberia"){
			String[] states = {"Bomi", "Bong", "Gbarpolu", "Grand Bassa", "Grand Cape Mount", "Grand Gedeh", "Grand Kru", "Lofa", "Margibi", "Maryland", "Montserrado", "Nimba", "River Cess", "River Gee", "Sinoe"};
			return states;
		}else if(countryName =="Libya"){
			String[] states = {"Tripoli","Benghazi","Misrata","Sabha"};
			return states;
		}else if(countryName =="Liechtenstein"){
			String[] states = {"Aan", "Balzers", "Eschen", "Gamprin", "Mauren", "Planken", "Ruggell", "Schaan", "Schellenberg", "Triesen", "Triesenberg"};
			return states;
		}else if(countryName =="Lithuania"){
			String[] states = {"Alytus County", "Kaunas County", "Klaipėda County", "Marijampolė County", "Panevėžys County", "Šiauliai County", "Tauragė County", "Telšiai County", "Utena County", "Vilnius County"};
			return states;
		}else if(countryName =="Luxembourg"){
			String[] states = {"Capellen", "Clervaux", "Diekirch", "Echternach", "Esch-sur-Alzette", "Grevenmacher", "Luxembourg", "Mersch", "Redange", "Remich", "Vianden", "Wiltz"};
			return states;
		}else if(countryName =="Madagascar"){
			String[] states = {"Antananarivo", "Antsiranana", "Fianarantsoa", "Mahajanga", "Toamasina", "Toliara"};
			return states;
		}else if(countryName =="Malawi"){
			String[] states = {"Balaka", "Blantyre", "Chikwawa", "Chiradzulu", "Chitipa", "Dedza", "Dowa", "Karonga", "Kasungu", "Likoma", "Lilongwe", "Machinga", "Mangochi", "Mchinji", "Mulanje", "Mwanza", "Mzimba", "Neno", "Nkhata Bay", "Nkhotakota", "Nsanje", "Ntcheu", "Ntchisi", "Phalombe", "Rumphi", "Salima", "Thyolo", "Zomba"};
			return states;
		}else if(countryName =="Malaysia"){
			String[] states = {"Johor", "Kedah", "Kelantan", "Malacca", "Negeri Sembilan", "Pahang", "Penang", "Perak", "Perlis", "Sabah", "Sarawak", "Selangor", "Terengganu", "Kuala Lumpur", "Labuan", "Putrajaya"};
			return states;
		}else if(countryName =="Maldives"){
			String[] states = {"Alif Alif", "Alif Dhaal", "Baa", "Dhaalu", "Faafu", "Gaafu Alif", "Gaafu Dhaalu", "Gnaviyani", "Haa Alif", "Haa Dhaalu", "Kaafu", "Laamu", "Lhaviyani", "Meemu", "Noonu", "Raa", "Seenu", "Shaviyani", "Thaa", "Vaavu", "Malé"};
			return states;
		}else if(countryName =="Mali"){
			String[] states = {"Kayes", "Koulikoro", "Sikasso", "Ségou", "Mopti", "Tombouctou", "Gao", "Kidal", "Ménaka", "Taoudénit", "Bamako"};
			return states;
		}else if(countryName =="Malta"){
			String[] states = {"Gozo Region", "Northern Region", "Port Region", "South Eastern Region", "Southern Region", "Western Region"};
			return states;
		}else if(countryName =="Marshall Islands"){
			String[] states = {"Ratak Chain", "Ralik Chain"};
			return states;
		}else if(countryName =="Mauritania"){
			String[] states = {"Adrar", "Assaba", "Brakna", "Dakhlet Nouadhibou", "Gorgol", "Guidimaka", "Hodh Ech Chargui", "Hodh El Gharbi", "Inchiri", "Nouakchott-Nord", "Nouakchott-Ouest", "Nouakchott-Sud", "Tagant", "Tiris Zemmour", "Trarza"};
			return states;
		}else if(countryName =="Mauritius"){
			String[] states = {"Black River", "Flacq", "Grand Port", "Moka", "Pamplemousses", "Plaines Wilhems", "Port Louis", "Rivière du Rempart", "Savanne", "Agalega Islands", "Cargados Carajos Shoals", "Rodrigues"};
			return states;
		}else if(countryName =="Mexico"){
			String[] states = {"Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Mexico State", "Mexico City", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas"};
			return states;
		}else if(countryName =="Micronesia"){
			String[] states = {"Chuuk", "Kosrae", "Pohnpei", "Yap"};
			return states;
		}else if(countryName =="Moldova"){
			String[] states = {"Anenii Noi", "Basarabeasca", "Briceni", "Cahul", "Cantemir", "Călărași", "Căușeni", "Cimișlia", "Criuleni", "Dondușeni", "Drochia", "Dubăsari", "Edineț", "Fălești", "Florești", "Glodeni", "Hîncești", "Ialoveni", "Leova", "Nisporeni", "Ocnița", "Orhei", "Rezina", "Rîșcani", "Sîngerei", "Soroca", "Strășeni", "Șoldănești", "Ștefan Vodă", "Taraclia", "Telenești", "Ungheni", "Chișinău", "Bălți", "Bender", "Gagauzia", "Transnistria"};
			return states;
		}else if(countryName =="Monaco"){
			String[] states = {"Monaco-Ville", "La Condamine", "Monte Carlo", "Fontvieille", "La Rousse", "Larvotto", "Saint Roman", "Jardin Exotique", "Les Moneghetti", "Ravin de Sainte-Dévote"};
			return states;
		}else if(countryName =="Mongolia"){
			String[] states = {"Arkhangai", "Bayan-Ölgii", "Bayankhongor", "Bulgan", "Darkhan-Uul", "Dornod", "Dornogovi", "Dundgovi", "Govi-Altai", "Govisümber", "Khentii", "Khovd", "Khövsgöl", "Orkhon", "Ömnögovi", "Selenge", "Sükhbaatar", "Töv", "Uvs", "Zavkhan", "Ulaanbaatar"};
			return states;
		}else if(countryName =="Montenegro"){
			String[] states = {"Andrijevica", "Bar", "Berane", "Bijelo Polje", "Budva", "Cetinje", "Danilovgrad", "Gusinje", "Herceg Novi", "Kolašin", "Kotor", "Mojkovac", "Nikšić", "Petnjica", "Plav", "Pljevlja", "Plužine", "Podgorica", "Rožaje", "Šavnik", "Tivat", "Tuzi", "Ulcinj", "Žabljak"};
			return states;
		}else if(countryName =="Morocco"){
			String[] states = {"Tanger-Tétouan-Al Hoceïma", "Oriental", "Fès-Meknès", "Rabat-Salé-Kénitra", "Béni Mellal-Khénifra", "Casablanca-Settat", "Marrakech-Safi", "Drâa-Tafilalet", "Souss-Massa", "Guelmim-Oued Noun", "Laâyoune-Sakia El Hamra", "Dakhla-Oued Ed-Dahab"};
			return states;
		}else if(countryName =="Mozambique"){
			String[] states = {"Cabo Delgado", "Gaza", "Inhambane", "Manica", "Maputo Province", "Nampula", "Niassa", "Sofala", "Tete", "Zambezia", "Maputo City"};
			return states;
		}else if(countryName =="Myanmar"){
			String[] states = {"Ayeyarwady", "Bago", "Chin", "Kachin", "Kayah", "Kayin", "Magway", "Mandalay", "Mon", "Naypyidaw", "Rakhine", "Sagaing", "Shan", "Tanintharyi", "Yangon"};
			return states;
		}else if(countryName =="Namibia"){
			String[] states = {"Erongo", "Hardap", "Karas", "Kavango East", "Kavango West", "Khomas", "Kunene", "Ohangwena", "Omaheke", "Omusati", "Oshana", "Oshikoto", "Otjozondjupa", "Zambezi"};
			return states;
		}else if(countryName =="Nauru"){
			String[] states = {"Aiwo", "Anabar", "Anetan", "Anibare", "Baiti", "Boe", "Buada", "Denigomodu", "Ewa", "Ijuw", "Meneng", "Nibok", "Uaboe", "Yaren"};
			return states;
		}else if(countryName =="Nepal"){
			String[] states = {"Koshi", "Madhesh", "Bagmati", "Gandaki", "Lumbini", "Karnali", "Sudurpashchim"};
			return states;
		}else if(countryName =="Netherlands"){
			String[] states = {"Drenthe", "Flevoland", "Friesland", "Gelderland", "Groningen", "Limburg", "North Brabant", "North Holland", "Overijssel", "South Holland", "Utrecht", "Zeeland"};
			return states;
		}else if(countryName =="New Zealand"){
			String[] states = {"Northland", "Auckland", "Waikato", "Bay of Plenty", "Gisborne", "Hawke's Bay", "Taranaki", "Manawatū-Whanganui", "Wellington", "Tasman", "Nelson", "Marlborough", "West Coast", "Canterbury", "Otago", "Southland"};
			return states;
		}else if(countryName =="Nicaragua"){
			String[] states = {"Boaco", "Carazo", "Chinandega", "Chontales", "Estelí", "Granada", "Jinotega", "León", "Madriz", "Managua", "Masaya", "Matagalpa", "Nueva Segovia", "Río San Juan", "Rivas", "North Caribbean Coast", "South Caribbean Coast"};
			return states;
		}else if(countryName =="Niger"){
			String[] states = {"Agadez", "Diffa", "Dosso", "Maradi", "Tahoua", "Tillabéri", "Zinder", "Niamey"};
			return states;
		}else if(countryName =="Nigeria"){
			String[] states = {"Abia", "Adamawa", "Akwa Ibom", "Anambra", "Bauchi", "Bayelsa", "Benue", "Borno", "Cross River", "Delta", "Ebonyi", "Edo", "Ekiti", "Enugu", "Gombe", "Imo", "Jigawa", "Kaduna", "Kano", "Katsina", "Kebbi", "Kogi", "Kwara", "Lagos", "Nasarawa", "Niger", "Ogun", "Ondo", "Osun", "Oyo", "Plateau", "Rivers", "Sokoto", "Taraba", "Yobe", "Zamfara", "Abuja"};
			return states;
		}else if(countryName =="North Korea"){
			String[] states = {"Chagang", "North Hamgyong", "South Hamgyong", "North Hwanghae", "South Hwanghae", "Kangwon", "North Pyongan", "South Pyongan", "Ryanggang", "Pyongyang", "Rason", "Nampo"};
			return states;
		}else if(countryName =="North Macedonia"){
			String[] states = {"Aerodrom", "Aračinovo", "Berovo", "Bitola", "Bogdanci", "Bogovinje", "Bosilovo", "Brvenica", "Butel", "Čair", "Čaška", "Centar", "Centar Župa", "Češinovo-Obleševo", "Čučer-Sandevo", "Debar", "Debarca", "Delčevo", "Demir Hisar", "Demir Kapija", "Dojran", "Dolneni", "Drugovo", "Gazi Baba", "Gevgelija", "Gjorče Petrov", "Gostivar", "Gradsko", "Ilinden", "Jegunovce", "Karbinci", "Karpoš", "Kavadarci", "Kičevo", "Kisela Voda", "Kočani", "Konče", "Kratovo", "Kriva Palanka", "Krivogaštani", "Kruševo", "Kumanovo", "Lipkovo", "Lozovo", "Makedonska Kamenica", "Makedonski Brod", "Mavrovo and Rostuša", "Mogila", "Negotino", "Novaci", "Novo Selo", "Ohrid", "Oslomej", "Pehčevo", "Petrovec", "Plasnica", "Prilep", "Probištip", "Radoviš", "Rankovce", "Resen", "Rosoman", "Saraj", "Sopište", "Staro Nagoričane", "Štip", "Struga", "Strumica", "Studeničani", "Šuto Orizari", "Sveti Nikole", "Tearce", "Tetovo", "Valandovo", "Vasilevo", "Veles", "Vevčani", "Vinica", "Vraneštica", "Vrapčište", "Zajas", "Zelenikovo", "Zrnovci", "Skopje"};
			return states;
		}else if(countryName =="Norway"){
			String[] states = {"Agder", "Innlandet", "Møre og Romsdal", "Nordland", "Oslo", "Rogaland", "Troms og Finnmark", "Trøndelag", "Vestfold og Telemark", "Vestland", "Viken"};
			return states;
		}else if(countryName =="Oman"){
			String[] states = {"Ad Dakhiliyah", "Ad Dhahirah", "Al Batinah North", "Al Batinah South", "Al Buraimi", "Al Wusta", "Ash Sharqiyah North", "Ash Sharqiyah South", "Dhofar", "Musandam", "Muscat"};
			return states;
		}else if(countryName =="Pakistan"){
			String[] states = {"Punjab", "Sindh", "Khyber Pakhtunkhwa", "Balochistan", "Islamabad Capital Territory", "Gilgit-Baltistan", "Azad Jammu and Kashmir"};
			return states;
		}else if(countryName =="Palau"){
			String[] states = {"Aimeliik", "Airai", "Angaur", "Hatohobei", "Kayangel", "Koror", "Melekeok", "Ngaraard", "Ngarchelong", "Ngardmau", "Ngatpang", "Ngchesar", "Ngeremlengui", "Ngiwal", "Peleliu", "Sonsorol"};
			return states;
		}else if(countryName =="Palestine"){
			String[] states = {"Bethlehem", "Deir al-Balah", "Gaza", "Hebron", "Jenin", "Jericho", "Jerusalem", "Khan Yunis", "Nablus", "North Gaza", "Qalqilya", "Rafah", "Ramallah and al-Bireh", "Salfit", "Tubas", "Tulkarm"};
			return states;
		}else if(countryName =="Panama"){
			String[] states = {"Bocas del Toro", "Chiriquí", "Coclé", "Colón", "Darién", "Herrera", "Los Santos", "Panamá", "Panamá Oeste", "Veraguas", "Guna Yala", "Emberá-Wounaan", "Ngäbe-Buglé"};
			return states;
		}else if(countryName =="Papua New Guinea"){
			String[] states = {"Central", "Chimbu", "Eastern Highlands", "East New Britain", "East Sepik", "Enga", "Gulf", "Hela", "Jiwaka", "Madang", "Manus", "Milne Bay", "Morobe", "New Ireland", "Northern", "Sandaun", "Southern Highlands", "West New Britain", "Western", "Western Highlands", "Bougainville", "National Capital District"};
			return states;
		}else if(countryName =="Paraguay"){
			String[] states = {"Alto Paraguay", "Alto Paraná", "Amambay", "Boquerón", "Caaguazú", "Caazapá", "Canindeyú", "Central", "Concepción", "Cordillera", "Guairá", "Itapúa", "Misiones", "Ñeembucú", "Paraguarí", "Presidente Hayes", "San Pedro", "Asunción"};
			return states;
		}else if(countryName =="Peru"){
			String[] states = {"Amazonas", "Áncash", "Apurímac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huánuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali"};
			return states;
		}else if(countryName =="Philippines"){
			String[] states = {"Bangsamoro", "Bicol", "Cagayan Valley", "Calabarzon", "Caraga", "Central Luzon", "Central Visayas", "Cordillera Administrative Region", "Davao Region", "Eastern Visayas", "Ilocos Region", "Mimaropa", "National Capital Region", "Northern Mindanao", "Soccsksargen", "Western Visayas", "Zamboanga Peninsula"};
			return states;
		}else if(countryName =="Poland"){
			String[] states = {"Lower Silesian", "Kuyavian-Pomeranian", "Lublin", "Lubusz", "Łódź", "Lesser Poland", "Masovian", "Opole", "Podlaskie", "Pomeranian", "Silesian", "Subcarpathian", "Świętokrzyskie", "Warmian-Masurian", "Greater Poland", "West Pomeranian"};
			return states;
		}else if(countryName =="Portugal"){
			String[] states = {"Aveiro", "Beja", "Braga", "Bragança", "Castelo Branco", "Coimbra", "Évora", "Faro", "Guarda", "Leiria", "Lisboa", "Portalegre", "Porto", "Santarém", "Setúbal", "Viana do Castelo", "Vila Real", "Viseu", "Azores", "Madeira"};
			return states;
		}else if(countryName =="Qatar"){
			String[] states = {"Ad Dawhah", "Al Daayen", "Al Khor", "Al Rayyan", "Al Shamal", "Al Wakrah", "Al Sheehaniya", "Umm Salal"};
			return states;
		}else if(countryName =="Romania"){
			String[] states = {"Alba", "Arad", "Argeș", "Bacău", "Bihor", "Bistrița-Năsăud", "Botoșani", "Brașov", "Brăila", "Buzău", "Caraș-Severin", "Călărași", "Cluj", "Constanța", "Covasna", "Dâmbovița", "Dolj", "Galați", "Giurgiu", "Gorj", "Harghita", "Hunedoara", "Ialomița", "Iași", "Ilfov", "Maramureș", "Mehedinți", "Mureș", "Neamț", "Olt", "Prahova", "Satu Mare", "Sălaj", "Sibiu", "Suceava", "Teleorman", "Timiș", "Tulcea", "Vaslui", "Vâlcea", "Vrancea", "Bucharest"};
			return states;
		}else if(countryName =="Russia"){
			String[] states = {"Adygea", "Altai Republic", "Altai Krai", "Amur Oblast", "Arkhangelsk Oblast", "Astrakhan Oblast", "Bashkortostan", "Belgorod Oblast", "Bryansk Oblast", "Buryatia", "Chechnya", "Chelyabinsk Oblast", "Chukotka Autonomous Okrug", "Chuvashia", "Dagestan", "Ingushetia", "Irkutsk Oblast", "Ivanovo Oblast", "Jewish Autonomous Oblast", "Kabardino-Balkaria", "Kaliningrad Oblast", "Kalmykia", "Kaluga Oblast", "Kamchatka Krai", "Karachay-Cherkessia", "Karelia", "Kemerovo Oblast", "Khabarovsk Krai", "Khakassia", "Khanty-Mansi Autonomous Okrug", "Kirov Oblast", "Komi", "Kostroma Oblast", "Krasnodar Krai", "Krasnoyarsk Krai", "Kurgan Oblast", "Kursk Oblast", "Leningrad Oblast", "Lipetsk Oblast", "Magadan Oblast", "Mari El", "Mordovia", "Moscow", "Moscow Oblast", "Murmansk Oblast", "Nenets Autonomous Okrug", "Nizhny Novgorod Oblast", "North Ossetia-Alania", "Novgorod Oblast", "Novosibirsk Oblast", "Omsk Oblast", "Orenburg Oblast", "Oryol Oblast", "Penza Oblast", "Perm Krai", "Primorsky Krai", "Pskov Oblast", "Rostov Oblast", "Ryazan Oblast", "Saint Petersburg", "Sakha (Yakutia)", "Sakhalin Oblast", "Samara Oblast", "Saratov Oblast", "Smolensk Oblast", "Stavropol Krai", "Sverdlovsk Oblast", "Tambov Oblast", "Tatarstan", "Tomsk Oblast", "Tula Oblast", "Tuva", "Tver Oblast", "Tyumen Oblast", "Udmurtia", "Ulyanovsk Oblast", "Vladimir Oblast", "Volgograd Oblast", "Vologda Oblast", "Voronezh Oblast", "Yamalo-Nenets Autonomous Okrug", "Yaroslavl Oblast"};
			return states;
		}else if(countryName =="Rwanda"){
			String[] states = {"Eastern Province", "Kigali City", "Northern Province", "Southern Province", "Western Province"};
			return states;
		}else if(countryName =="Saint Kitts and Nevis"){
			String[] states = {"Christ Church Nichola Town", "Saint Anne Sandy Point", "Saint George Basseterre", "Saint George Gingerland", "Saint James Windward", "Saint John Capisterre", "Saint John Figtree", "Saint Mary Cayon", "Saint Paul Capisterre", "Saint Paul Charlestown", "Saint Peter Basseterre", "Saint Thomas Lowland", "Saint Thomas Middle Island", "Trinity Palmetto Point"};
			return states;
		}else if(countryName =="Saint Lucia"){
			String[] states = {"Anse la Raye", "Canaries", "Castries", "Choiseul", "Dennery", "Gros Islet", "Laborie", "Micoud", "Soufrière", "Vieux Fort"};
			return states;
		}else if(countryName =="Saint Vincent and the Grenadines"){
			String[] states = {"Charlotte", "Grenadines", "Saint Andrew", "Saint David", "Saint George", "Saint Patrick"};
			return states;
		}else if(countryName =="Samoa"){
			String[] states = {"A'ana", "Aiga-i-le-Tai", "Atua", "Fa'asaleleaga", "Gaga'emauga", "Gaga'ifomauga", "Palauli", "Satupa'itea", "Tuamasaga", "Va'a-o-Fonoti", "Vaisigano"};
			return states;
		}else if(countryName =="San Marino"){
			String[] states = {"Acquaviva", "Borgo Maggiore", "Chiesanuova", "Domagnano", "Faetano", "Fiorentino", "Montegiardino", "San Marino", "Serravalle"};
			return states;
		}else if(countryName =="Sao Tome and Principe"){
			String[] states = {"Água Grande", "Cantagalo", "Caué", "Lembá", "Lobata", "Mé-Zóchi", "Príncipe"};
			return states;
		}else if(countryName =="Saudi Arabia"){
			String[] states = {"Riyadh", "Makkah", "Madinah", "Eastern Province", "Asir", "Tabuk", "Hail", "Northern Borders", "Jazan", "Najran", "Al Bahah", "Al Jouf", "Al Qassim"};
			return states;
		}else if(countryName =="Senegal"){
			String[] states = {"Dakar", "Diourbel", "Fatick", "Kaffrine", "Kaolack", "Kédougou", "Kolda", "Louga", "Matam", "Saint-Louis", "Sédhiou", "Tambacounda", "Thiès", "Ziguinchor"};
			return states;
		}else if(countryName =="Serbia"){
			String[] states = {"Belgrade", "Bor", "Braničevo", "Jablanica", "Kolubara", "Mačva", "Moravica", "Nišava", "North Bačka", "North Banat", "Pčinja", "Pirot", "Podunavlje", "Pomoravlje", "Rasina", "Raška", "South Bačka", "South Banat", "Srem", "Šumadija", "Toplica", "West Bačka", "Zaječar", "Zlatibor"};
			return states;
		}else if(countryName =="Seychelles"){
			String[] states = {"Anse aux Pins", "Anse Boileau", "Anse Etoile", "Anse Royale", "Au Cap", "Baie Lazare", "Baie Sainte Anne", "Beau Vallon", "Bel Air", "Bel Ombre", "Cascade", "Glacis", "Grand'Anse Mahé", "Grand'Anse Praslin", "La Digue", "La Rivière Anglaise", "Les Mamelles", "Mont Buxton", "Mont Fleuri", "Plaisance", "Pointe La Rue", "Port Glaud", "Roche Caiman", "Saint Louis", "Takamaka"};
			return states;
		}else if(countryName =="Sierra Leone"){
			String[] states = {"Eastern Province", "Northern Province", "North Western Province", "Southern Province", "Western Area"};
			return states;
		}else if(countryName =="Singapore"){
			String[] states = {"Central Region", "East Region", "North Region", "North-East Region", "West Region"};
			return states;
		}else if(countryName =="Slovakia"){
			String[] states = {"Bratislava", "Trnava", "Trenčín", "Nitra", "Žilina", "Banská Bystrica", "Prešov", "Košice"};
			return states;
		}else if(countryName =="Slovenia"){
			String[] states = {"Pomurska", "Podravska", "Koroška", "Savinjska", "Zasavska", "Posavska", "Jugovzhodna Slovenija", "Osrednjeslovenska", "Gorenjska", "Primorsko-notranjska", "Goriška", "Obalno-kraška"};
			return states;
		}else if(countryName =="Solomon Islands"){
			String[] states = {"Central", "Choiseul", "Guadalcanal", "Honiara", "Isabel", "Makira-Ulawa", "Malaita", "Rennell and Bellona", "Temotu", "Western"};
			return states;
		}else if(countryName =="Somalia"){
			String[] states = {"Awdal", "Bakool", "Banaadir", "Bari", "Bay", "Galguduud", "Gedo", "Hiiraan", "Lower Juba", "Lower Shabelle", "Middle Juba", "Middle Shabelle", "Mudug", "Nugal", "Sanaag", "Sool", "Togdheer", "Woqooyi Galbeed"};
			return states;
		}else if(countryName =="South Africa"){
			String[] states = {"Eastern Cape", "Free State", "Gauteng", "KwaZulu-Natal", "Limpopo", "Mpumalanga", "North West", "Northern Cape", "Western Cape"};
			return states;
		}else if(countryName =="South Korea"){
			String[] states = {"Seoul", "Busan", "Daegu", "Incheon", "Gwangju", "Daejeon", "Ulsan", "Sejong", "Gyeonggi", "Gangwon", "North Chungcheong", "South Chungcheong", "North Jeolla", "South Jeolla", "North Gyeongsang", "South Gyeongsang", "Jeju"};
			return states;
		}else if(countryName =="South Sudan"){
			String[] states = {"Central Equatoria", "Eastern Equatoria", "Jonglei", "Lakes", "Northern Bahr el Ghazal", "Unity", "Upper Nile", "Warrap", "Western Bahr el Ghazal", "Western Equatoria", "Abyei Area", "Greater Pibor Administrative Area", "Ruweng Administrative Area"};
			return states;
		}else if(countryName =="Spain"){
			String[] states = {"Andalusia", "Aragon", "Asturias", "Balearic Islands", "Basque Country", "Canary Islands", "Cantabria", "Castile and León", "Castile-La Mancha", "Catalonia", "Extremadura", "Galicia", "La Rioja", "Madrid", "Murcia", "Navarre", "Valencian Community", "Ceuta", "Melilla"};
			return states;
		}else if(countryName =="Sri Lanka"){
			String[] states = {"Central Province", "Eastern Province", "North Central Province", "Northern Province", "North Western Province", "Sabaragamuwa Province", "Southern Province", "Uva Province", "Western Province"};
			return states;
		}else if(countryName =="Sudan"){
			String[] states = {"Al Jazirah", "Al Qadarif", "Blue Nile", "Central Darfur", "East Darfur", "Kassala", "Khartoum", "North Darfur", "North Kordofan", "Northern", "Red Sea", "River Nile", "Sennar", "South Darfur", "South Kordofan", "West Darfur", "West Kordofan", "White Nile"};
			return states;
		}else if(countryName =="Suriname"){
			String[] states = {"Brokopondo", "Commewijne", "Coronie", "Marowijne", "Nickerie", "Para", "Paramaribo", "Saramacca", "Sipaliwini", "Wanica"};
			return states;
		}else if(countryName =="Sweden"){
			String[] states = {"Blekinge", "Dalarna", "Gävleborg", "Gotland", "Halland", "Jämtland", "Jönköping", "Kalmar", "Kronoberg", "Norrbotten", "Örebro", "Östergötland", "Skåne", "Södermanland", "Stockholm", "Uppsala", "Värmland", "Västerbotten", "Västernorrland", "Västmanland", "Västra Götaland"};
			return states;
		}else if(countryName =="Switzerland"){
			String[] states = {"Aargau", "Appenzell Ausserrhoden", "Appenzell Innerrhoden", "Basel-Landschaft", "Basel-Stadt", "Bern", "Fribourg", "Geneva", "Glarus", "Graubünden", "Jura", "Lucerne", "Neuchâtel", "Nidwalden", "Obwalden", "Schaffhausen", "Schwyz", "Solothurn", "St. Gallen", "Thurgau", "Ticino", "Uri", "Valais", "Vaud", "Zug", "Zurich"};
			return states;
		}else if(countryName =="Syria"){
			String[] states = {"Aleppo", "Damascus", "Daraa", "Deir ez-Zor", "Hama", "Homs", "Idlib", "Latakia", "Quneitra", "Raqqa", "Rif Dimashq", "As-Suwayda", "Tartus", "Al-Hasakah"};
			return states;
		}else if(countryName =="Taiwan"){
			String[] states = {"Changhua County", "Chiayi City", "Chiayi County", "Hsinchu City", "Hsinchu County", "Hualien County", "Kaohsiung", "Keelung", "Kinmen County", "Lienchiang County", "Miaoli County", "Nantou County", "New Taipei", "Penghu County", "Pingtung County", "Taichung", "Tainan", "Taipei", "Taitung County", "Taoyuan", "Yilan County", "Yunlin County"};
			return states;
		}else if(countryName =="Tajikistan"){
			String[] states = {"Sughd", "Khatlon", "Gorno-Badakhshan", "Districts of Republican Subordination", "Dushanbe"};
			return states;
		}else if(countryName =="Tanzania"){
			String[] states = {"Arusha", "Dar es Salaam", "Dodoma", "Geita", "Iringa", "Kagera", "Katavi", "Kigoma", "Kilimanjaro", "Lindi", "Manyara", "Mara", "Mbeya", "Morogoro", "Mtwara", "Mwanza", "Njombe", "Pemba North", "Pemba South", "Pwani", "Rukwa", "Ruvuma", "Shinyanga", "Simiyu", "Singida", "Songwe", "Tabora", "Tanga", "Zanzibar North", "Zanzibar South", "Zanzibar West"};
			return states;
		}else if(countryName =="Thailand"){
			String[] states = {"Amnat Charoen", "Ang Thong", "Bangkok", "Bueng Kan", "Buri Ram", "Chachoengsao", "Chai Nat", "Chaiyaphum", "Chanthaburi", "Chiang Mai", "Chiang Rai", "Chon Buri", "Chumphon", "Kalasin", "Kamphaeng Phet", "Kanchanaburi", "Khon Kaen", "Krabi", "Lampang", "Lamphun", "Loei", "Lop Buri", "Mae Hong Son", "Maha Sarakham", "Mukdahan", "Nakhon Nayok", "Nakhon Pathom", "Nakhon Phanom", "Nakhon Ratchasima", "Nakhon Sawan", "Nakhon Si Thammarat", "Nan", "Narathiwat", "Nong Bua Lamphu", "Nong Khai", "Nonthaburi", "Pathum Thani", "Pattani", "Phang Nga", "Phatthalung", "Phayao", "Phetchabun", "Phetchaburi", "Phichit", "Phitsanulok", "Phra Nakhon Si Ayutthaya", "Phrae", "Phuket", "Prachin Buri", "Prachuap Khiri Khan", "Ranong", "Ratchaburi", "Rayong", "Roi Et", "Sa Kaeo", "Sakon Nakhon", "Samut Prakan", "Samut Sakhon", "Samut Songkhram", "Saraburi", "Satun", "Sing Buri", "Sisaket", "Songkhla", "Sukhothai", "Suphan Buri", "Surat Thani", "Surin", "Tak", "Trang", "Trat", "Ubon Ratchathani", "Udon Thani", "Uthai Thani", "Uttaradit", "Yala", "Yasothon"};
			return states;
		}else if(countryName =="Timor-Leste"){
			String[] states = {"Aileu", "Ainaro", "Atauro", "Baucau", "Bobonaro", "Cova Lima", "Dili", "Ermera", "Lautém", "Liquiçá", "Manatuto", "Manufahi", "Viqueque"};
			return states;
		}else if(countryName =="Togo"){
			String[] states = {"Kara", "Maritime", "Plateaux", "Savanes", "Centrale"};
			return states;
		}else if(countryName =="Tonga"){
			String[] states = {"Eua", "Ha'apai", "Niuas", "Tongatapu", "Vava'u"};
			return states;
		}else if(countryName =="Trinidad and Tobago"){
			String[] states = {"Arima", "Chaguanas", "Couva-Tabaquite-Talparo", "Diego Martin", "Mayaro-Rio Claro", "Penal-Debe", "Point Fortin", "Port of Spain", "Princes Town", "San Fernando", "San Juan-Laventille", "Sangre Grande", "Siparia", "Tunapuna-Piarco"};
			return states;
		}else if(countryName =="Tunisia"){
			String[] states = {"Ariana", "Beja", "Ben Arous", "Bizerte", "Gabes", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "Kebili", "Kef", "Mahdia", "Manouba", "Medenine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Tunis", "Zaghouan"};
			return states;
		}else if(countryName =="Turkey"){
			String[] states = {"Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya", "Ankara", "Antalya", "Ardahan", "Artvin", "Aydın", "Balıkesir", "Bartın", "Batman", "Bayburt", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Düzce", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Iğdır", "Isparta", "Istanbul", "Izmir", "Kahramanmaraş", "Karabük", "Karaman", "Kars", "Kastamonu", "Kayseri", "Kırıkkale", "Kırklareli", "Kırşehir", "Kilis", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Mardin", "Mersin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Osmaniye", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Şanlıurfa", "Şırnak", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Uşak", "Van", "Yalova", "Yozgat", "Zonguldak"};
			return states;
		}else if(countryName =="Turkmenistan"){
			String[] states = {"Arima", "Chaguanas", "Couva-Tabaquite-Talparo", "Diego Martin", "Mayaro-Rio Claro", "Penal-Debe", "Point Fortin", "Port of Spain", "Princes Town", "San Fernando", "San Juan-Laventille", "Sangre Grande", "Siparia", "Tunapuna-Piarco"};
			return states;
		}else if(countryName =="Tuvalu"){
			String[] states = {"Funafuti", "Nanumea", "Nanumanga", "Niutao", "Nui", "Nukufetau", "Nukulaelae", "Vaitupu", "Niulakita"};
			return states;
		}else if(countryName =="Uganda"){
			String[] states = {"Central Region", "Eastern Region", "Northern Region", "Western Region"};
			return states;
		}else if(countryName =="Ukraine"){
			String[] states = {"Cherkasy", "Chernihiv", "Chernivtsi", "Dnipropetrovsk", "Donetsk", "Ivano-Frankivsk", "Kharkiv", "Kherson", "Khmelnytskyi", "Kirovohrad", "Kyiv", "Kyiv City", "Luhansk", "Lviv", "Mykolaiv", "Odesa", "Poltava", "Rivne", "Sumy", "Ternopil", "Vinnytsia", "Volyn", "Zakarpattia", "Zaporizhzhia", "Zhytomyr", "Crimea", "Sevastopol"};
			return states;
		}else if(countryName =="United Arab Emirates"){
			String[] states = {"Abu Dhabi", "Ajman", "Dubai", "Fujairah", "Ras Al Khaimah", "Sharjah", "Umm Al Quwain"};
			return states;
		}else if(countryName =="United Kingdom"){
			String[] states = {"England", "Scotland", "Wales", "Northern Ireland"};
			return states;
		}else if(countryName =="United States"){
			String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming", "District of Columbia"};
			return states;
		}else if(countryName =="Uruguay"){
			String[] states = {"Artigas", "Canelones", "Cerro Largo", "Colonia", "Durazno", "Flores", "Florida", "Lavalleja", "Maldonado", "Montevideo", "Paysandú", "Río Negro", "Rivera", "Rocha", "Salto", "San José", "Soriano", "Tacuarembó", "Treinta y Tres"};
			return states;
		}else if(countryName =="Uzbekistan"){
			String[] states = {"Andijan", "Bukhara", "Fergana", "Jizzakh", "Kashkadarya", "Khorezm", "Namangan", "Navoiy", "Samarkand", "Sirdaryo", "Surkhandarya", "Tashkent Region", "Karakalpakstan", "Tashkent City"};
			return states;
		}else if(countryName =="Vanuatu"){
			String[] states = {"Malampa", "Penama", "Sanma", "Shefa", "Tafea", "Torba"};
			return states;
		}else if(countryName =="Venezuela"){
			String[] states = {"Amazonas", "Anzoátegui", "Apure", "Aragua", "Barinas", "Bolívar", "Carabobo", "Cojedes", "Delta Amacuro", "Falcón", "Guárico", "La Guaira", "Lara", "Mérida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Táchira", "Trujillo", "Yaracuy", "Zulia", "Distrito Capital"};
			return states;
		}else if(countryName =="Vietnam"){
			String[] states = {"An Giang", "Ba Ria-Vung Tau", "Bac Giang", "Bac Kan", "Bac Lieu", "Bac Ninh", "Ben Tre", "Binh Duong", "Binh Dinh", "Binh Phuoc", "Binh Thuan", "Ca Mau", "Cao Bang", "Can Tho", "Da Nang", "Dak Lak", "Dak Nong", "Dien Bien", "Dong Nai", "Dong Thap", "Gia Lai", "Ha Giang", "Ha Nam", "Ha Noi", "Ha Tinh", "Hai Duong", "Hai Phong", "Hau Giang", "Hoa Binh", "Hung Yen", "Khanh Hoa", "Kien Giang", "Kon Tum", "Lai Chau", "Lam Dong", "Lang Son", "Lao Cai", "Long An", "Nam Dinh", "Nghe An", "Ninh Binh", "Ninh Thuan", "Phu Tho", "Phu Yen", "Quang Binh", "Quang Nam", "Quang Ngai", "Quang Ninh", "Quang Tri", "Soc Trang", "Son La", "Tay Ninh", "Thai Binh", "Thai Nguyen", "Thanh Hoa", "Thua Thien Hue", "Tien Giang", "Tra Vinh", "Tuyen Quang", "Vinh Long", "Vinh Phuc", "Yen Bai", "Ho Chi Minh City"};
			return states;
		}else if(countryName =="Yemen"){
			String[] states = {"Abyan", "Aden", "Al Bayda", "Al Hudaydah", "Al Jawf", "Al Mahrah", "Al Mahwit", "Amanat Al Asimah", "Amran", "Dhamar", "Hadhramaut", "Hajjah", "Ibb", "Lahij", "Marib", "Raymah", "Saada", "Sana'a", "Shabwah", "Socotra", "Taiz", "Sana'a City"};
			return states;
		}else if(countryName =="Zambia"){
			String[] states = {"Central", "Copperbelt", "Eastern", "Luapula", "Lusaka", "Muchinga", "Northern", "North-Western", "Southern", "Western"};
			return states;
		}else if(countryName =="Zimbabwe"){
			String[] states = {"Bulawayo", "Harare", "Manicaland", "Mashonaland Central", "Mashonaland East", "Mashonaland West", "Masvingo", "Matabeleland North", "Matabeleland South", "Midlands"};
			return states;
		}
		return null;
	}
	
	public static void getStates(String[] states){
		for(String state : states){
			System.out.println(state);
		}
	}
}