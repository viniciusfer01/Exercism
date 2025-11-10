module Blackjack
  def self.parse_card(card)
    case card
    when 'ace'
      11
    when 'two'
      2
    when 'three'
      3
    when 'four'
      4
    when 'five'
      5
    when 'six'
      6
    when 'seven'
      7
    when 'eight'
      8
    when 'nine'
      9
    when 'ten'
      10
    when 'jack'
      10
    when 'queen'
      10
    when 'king'
      10
    else
      0
    end 
  end

  def self.card_range(card1, card2)
    score = Blackjack.parse_card(card1) + Blackjack.parse_card(card2)

    case score
    when 4..11
      'low'
    when 12..16
      'mid'
    when 17..20
      'high'
    when 21
      'blackjack'
    else 
      'no chance'
    end
  end

  def self.first_turn(card1, card2, dealer_card)
    score_type = Blackjack.card_range(card1, card2)
    dealer_score = Blackjack.parse_card(dealer_card)

    case score_type
    when 'blackjack' 
      if dealer_score < 10 
        'W'
      else
        'S'
      end
    when 'high'
      'S' 
    when 'mid'
      unless dealer_score >= 7
        return 'S'
      end
      'H'
    when 'low'
      'H'
    else
      if card1 == 'ace' && card2 == 'ace'
        'P'
      end
    end
  end
end
