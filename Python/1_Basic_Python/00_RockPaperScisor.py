import random
def get_choices():
  player_choice=input("Enter a choice (rock, paper, scissors): ")
  options=["rock","paper","scissors"]
  comp_choice=random.choice(options)
  choices={"player":player_choice,"computer":comp_choice}
  return choices


def check_win(player,computer):
  print(f"You choose {player}, computer choose {computer}.")
  if player==computer :
    return  "It's a tie"
  elif player=="rock":
    if computer=="scissors":
      return "Rock smashes scissors, you win!"
    else:
      return "Paper covers rock, you lose"
  elif player=="paper":
    if computer=="rock":
      return "Paper covers rock,! you win!"
    else:
      return "Scissors, you lose"
  elif player=="scissors":
    if computer=="rock":
      return "Scissors cut paper,! you win!"
    else:
      return "Rock smashes scissors, you lose"

choices=get_choices()
result=check_win(choices["player"],choices["computer"])
print(result)



