class BoutiqueInventory
  def initialize(items)
    @items = items
  end

  def item_names
    item_names = @items.map { |item| item[:name] }
    item_names.sort
  end

  def cheap
    @items.select do |item|
      [item[:price], item[:name]] if item[:price] < 30
    end
  end

  def out_of_stock
    @items.select do |item| 
      item[:quantity_by_size].empty?
    end
  end

  def stock_for_item(name)
    desired_items = @items.select { |item| item[:name] == name }

    desired_items.first[:quantity_by_size]
  end

  def total_stock
    sum = 0
    @items.each do |item|
      sum += item[:quantity_by_size].sum {|_, quantity| quantity}
    end
    sum
  end

  private
  attr_reader :items
end
