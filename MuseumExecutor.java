class MuseumExecutor {
    public static void main(String[] args) {

        Museum obj = new Museum();

        obj.addMonument("Taj Mahal");
        obj.addMonument("Red Fort");
        obj.addMonument("Qutub Minar");
        obj.addMonument("Hampi");
        obj.addMonument("Mysore Palace");
        obj.addMonument("India Gate");
        obj.addMonument("Gateway of India");
        obj.addMonument("Konark Sun Temple");
        obj.addMonument("Ajanta Caves");
        obj.addMonument("Ellora Caves");
        obj.addMonument("Charminar");
        obj.addMonument("Golden Temple");
        obj.addMonument("Victoria Memorial");
        obj.addMonument("Sanchi Stupa");
        obj.addMonument("Fatehpur Sikri");
        obj.addMonument("Meenakshi Temple");

        obj.getMonuments();
    }
}