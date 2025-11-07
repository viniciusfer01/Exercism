module Chess
  RANKS = (1..8)
  FILES = ("A".."H")

  def self.valid_square?(rank, file)
    if RANKS.include?(rank.to_i) && FILES.include?(file)
      true
    else
      false 
    end
  end

  def self.nickname(first_name, last_name)
    (first_name[0...2] + last_name[-2..-1]).upcase
  end

  def self.move_message(first_name, last_name, square)
    nickname = Chess.nickname(first_name, last_name)
    file = square[0]
    rank = square[1]
    if Chess.valid_square?(rank, file)
      "#{nickname} moved to #{square}"
    else
      "#{nickname} attempted to move to #{square}, but that is not a valid square"
    end
  end
end
