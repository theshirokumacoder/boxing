package com.shirokuma.aws.argocd;

public class Boxer {
	
	public Boxer() {
		super();
	}
	public Boxer(int boxerId, String boxerName, int wins, int losses, int draws, int knockouts, String rank) {
		super();
		this.boxerId = boxerId;
		this.boxerName = boxerName;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
		this.knockouts = knockouts;
		this.rank = rank;
	}
	public int getBoxerId() {
		return boxerId;
	}
	public void setBoxerId(int boxerId) {
		this.boxerId = boxerId;
	}
	public String getBoxerName() {
		return boxerName;
	}
	public void setBoxerName(String boxerName) {
		this.boxerName = boxerName;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getDraws() {
		return draws;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
	public int getKnockouts() {
		return knockouts;
	}
	public void setKnockouts(int knockouts) {
		this.knockouts = knockouts;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	private int boxerId;
	private String boxerName;
	private int wins;
	private int losses;
	private int draws;
	private int knockouts;
	private String rank;

}
