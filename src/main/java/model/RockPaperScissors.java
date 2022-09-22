package model;

import java.util.Random;

/**  
* Logan Kennebeck - ljkennebeck1  
* CIS171 22149
* Sep 16, 2022  
*/
public class RockPaperScissors {
	
	private String playerOne;
	private String playerTwo;
	private String winner;
	
	public RockPaperScissors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RockPaperScissors(String playerOne) {
		super();
		this.playerOne = playerOne;
		playRPS(playerOne);
	}

	public String getPlayerOne() {
		return playerOne;
	}

	public void setPlayerOne(String playerOne) {
		this.playerOne = playerOne;
		playRPS(playerOne);
	}

	public String getPlayerTwo() {
		return playerTwo;
	}

	public void setPlayerTwo(String playerTwo) {
		this.playerTwo = playerTwo;
	}
	
	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public void playRPS(String playerOne_) {
		playerOne = playerOne_.substring(0,1).toUpperCase()+ playerOne_.substring(1).toLowerCase();
		String playerTwo = "";
		String winner = "";
		Random rand = new Random();
		int range = 3;
		int randomNum = rand.nextInt(range);
		
		switch(randomNum) {
		case 0:
			playerTwo = "Rock";
		break;
		case 1:
			playerTwo = "Paper";
		break;
		case 2:
			playerTwo = "Scissors";
		break;
		default:
			playerTwo = "Error";
		}
		
		if(playerOne.equals("Rock")) {
			if(playerTwo.equals("Rock")) {
				winner = "It's a tie!";
			}else if(playerTwo.equals("Paper")) {
				winner = "Opponent wins!";
			}else if(playerTwo.equals("Scissors")) {
				winner = "You win!";
			}
		}else if(playerOne.equals("Paper")) {
			if(playerTwo.equals("Rock")) {
				winner = "You win!";
			}else if(playerTwo.equals("Paper")) {
				winner = "It's a tie!";
			}else if(playerTwo.equals("Scissors")) {
				winner = "Opponent wins!";
			}
		}else if(playerOne.equals("Scissors")) {
			if(playerTwo.equals("Rock")) {
				winner = "Opponent wins!";
			}else if(playerTwo.equals("Paper")) {
				winner = "You win!";
			}else if(playerTwo.equals("Scissors")) {
				winner = "It's a tie!";
			}
		}else {
			winner = "Error";
		}
		setPlayerTwo(playerTwo);
		setWinner(winner);
		
	}

	@Override
	public String toString() {
		return "RockPaperScissors [playerOne=" + playerOne + ", playerTwo=" + playerTwo + "]";
	}
	
	

}
