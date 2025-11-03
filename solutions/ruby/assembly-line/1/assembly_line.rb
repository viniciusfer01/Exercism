class AssemblyLine
  CARS_PER_HOUR = 221
  def initialize(speed)
    @speed = speed
  end

  def production_rate_per_hour
    unless @speed > 0 || @speed <= 10
      return 'Invalid speed'
    end 
    
    if @speed > 0 && @speed <= 4
      (@speed * CARS_PER_HOUR).to_f
    elsif @speed <= 8
      @speed * CARS_PER_HOUR * 0.9
    elsif @speed <= 9
      @speed * CARS_PER_HOUR * 0.8
    else 
      @speed * CARS_PER_HOUR * 0.77
    end
  end

  def working_items_per_minute
    unless @speed > 0 || @speed <= 10
      return 'Invalid speed'
    end 
    
    if @speed > 0 && @speed <= 4
      result = (@speed * CARS_PER_HOUR).to_f
    elsif @speed <= 8
      result = @speed * CARS_PER_HOUR * 0.9
    elsif @speed <= 9
      result = @speed * CARS_PER_HOUR * 0.8
    else 
      result = @speed * CARS_PER_HOUR * 0.77
    end

    (result/60).to_i
  end
end
