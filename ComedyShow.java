class ComedyShow {

    int showId;
    String showName;
    String comedianName;
    String genre;
    double ticketPrice;
    int duration;
    String showDate;
    String showTime;
    String venue;
    String city;
    boolean isLive;
    boolean isAvailable;
    int rating;
    String language;
    String organizer;
    String platform;
    String audienceType;
    double totalSeats;
    String sponsor;
    String specialNotes;

    public ComedyShow() {
        this(1, "Laugh Riot", "Zakir Khan", "Stand-up", 499.0, 120, "10-04-2026", "7:00 PM", "Auditorium", "Bangalore", true, true, 5, "Hindi", "EventCorp", "Offline", "Adults", 500, "BrandX", "No late entry");
    }

    public ComedyShow(int showId, String showName, String comedianName, String genre, double ticketPrice, int duration, String showDate, String showTime, String venue, String city, boolean isLive, boolean isAvailable, int rating, String language, String organizer, String platform, String audienceType, double totalSeats, String sponsor, String specialNotes) {

        this.showId = showId;
        this.showName = showName;
        this.comedianName = comedianName;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
        this.duration = duration;
        this.showDate = showDate;
        this.showTime = showTime;
        this.venue = venue;
        this.city = city;
        this.isLive = isLive;
        this.isAvailable = isAvailable;
        this.rating = rating;
        this.language = language;
        this.organizer = organizer;
        this.platform = platform;
        this.audienceType = audienceType;
        this.totalSeats = totalSeats;
        this.sponsor = sponsor;
        this.specialNotes = specialNotes;
    }

    void display() {

        System.out.println("Show ID: " + showId);
        System.out.println("Show Name: " + showName);
        System.out.println("Comedian Name: " + comedianName);
        System.out.println("Genre: " + genre);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Duration (mins): " + duration);
        System.out.println("Show Date: " + showDate);
        System.out.println("Show Time: " + showTime);
        System.out.println("Venue: " + venue);
        System.out.println("City: " + city);
        System.out.println("Is Live: " + isLive);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Rating: " + rating);
        System.out.println("Language: " + language);
        System.out.println("Organizer: " + organizer);
        System.out.println("Platform: " + platform);
        System.out.println("Audience Type: " + audienceType);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("Special Notes: " + specialNotes);
    }
}