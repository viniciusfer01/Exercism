class LogLineParser
  def initialize(line)
    @line = line
  end

  def message
    @message = @line.split(":")[1].strip
    @message
  end

  def log_level
    @level = @line.split(":").first.gsub('[', '').gsub(']', '').downcase
    @level
  end

  def reformat
    "#{@line.split(":")[1].strip} (#{@line.split(":").first.gsub('[', '').gsub(']', '').downcase})"
  end
end
