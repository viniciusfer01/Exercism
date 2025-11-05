module Port
  IDENTIFIER = :PALE
  ALLOWED_TYPES = [:OIL, :GAS]
  
  def self.get_identifier(city)
    city[0..3].upcase.to_sym
  end

  def self.get_terminal(ship_identifier)
    type = ship_identifier.to_s[0..2].to_sym
    
    if ALLOWED_TYPES.include?(type)
      :A
    else 
      :B
    end
  end
end
