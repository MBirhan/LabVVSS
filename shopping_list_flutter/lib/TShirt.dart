class TShirt{

  int id;
  String band;
  String color;
  String size;
  int price;
  String currency;

  TShirt(int id, String band, String color, String size, int price, String currency){
    this.id = id;
    this.band = band;
    this.color = color;
    this.size = size;
    this.price = price;
    this.currency = currency;
  }

  @override
  String toString() {
    return this.band + ' ' + this.color + ' ' + this.size;
  }
}