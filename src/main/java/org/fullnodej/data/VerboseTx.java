// Generated by delombok at Wed Apr 20 02:15:35 MDT 2016
package org.fullnodej.data;

import org.fullnodej.Rpc;

public class VerboseTx extends Tx {
	
	/**
	 * Tx as hex string, same as returned by {@link Rpc#getrawtransaction(String)}
	 */
	String hex;
	
	/**
	 * hex string of the enclosing block header if this has been mined
	 */
	String blockhash;
	
	/**
	 * greater than 0 if this has been mined
	 */
	int confirmations;
	
	/**
	 * time of block if this has been mined
	 */
	long time;
	
	/**
	 * #winning: "This field is currently identical to the time field described above"
	 */
	long blocktime;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public VerboseTx() {
	}

	/**
	 * Tx as hex string, same as returned by {@link Rpc#getrawtransaction(String)}
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getHex() {
		return this.hex;
	}

	/**
	 * hex string of the enclosing block header if this has been mined
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getBlockhash() {
		return this.blockhash;
	}

	/**
	 * greater than 0 if this has been mined
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getConfirmations() {
		return this.confirmations;
	}

	/**
	 * time of block if this has been mined
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public long getTime() {
		return this.time;
	}

	/**
	 * #winning: "This field is currently identical to the time field described above"
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public long getBlocktime() {
		return this.blocktime;
	}

	/**
	 * Tx as hex string, same as returned by {@link Rpc#getrawtransaction(String)}
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setHex(final String hex) {
		this.hex = hex;
	}

	/**
	 * hex string of the enclosing block header if this has been mined
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setBlockhash(final String blockhash) {
		this.blockhash = blockhash;
	}

	/**
	 * greater than 0 if this has been mined
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setConfirmations(final int confirmations) {
		this.confirmations = confirmations;
	}

	/**
	 * time of block if this has been mined
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setTime(final long time) {
		this.time = time;
	}

	/**
	 * #winning: "This field is currently identical to the time field described above"
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setBlocktime(final long blocktime) {
		this.blocktime = blocktime;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "VerboseTx(hex=" + this.getHex() + ", blockhash=" + this.getBlockhash() + ", confirmations=" + this.getConfirmations() + ", time=" + this.getTime() + ", blocktime=" + this.getBlocktime() + ")";
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof VerboseTx)) return false;
		final VerboseTx other = (VerboseTx)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$hex = this.getHex();
		final java.lang.Object other$hex = other.getHex();
		if (this$hex == null ? other$hex != null : !this$hex.equals(other$hex)) return false;
		final java.lang.Object this$blockhash = this.getBlockhash();
		final java.lang.Object other$blockhash = other.getBlockhash();
		if (this$blockhash == null ? other$blockhash != null : !this$blockhash.equals(other$blockhash)) return false;
		if (this.getConfirmations() != other.getConfirmations()) return false;
		if (this.getTime() != other.getTime()) return false;
		if (this.getBlocktime() != other.getBlocktime()) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof VerboseTx;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $hex = this.getHex();
		result = result * PRIME + ($hex == null ? 43 : $hex.hashCode());
		final java.lang.Object $blockhash = this.getBlockhash();
		result = result * PRIME + ($blockhash == null ? 43 : $blockhash.hashCode());
		result = result * PRIME + this.getConfirmations();
		final long $time = this.getTime();
		result = result * PRIME + (int)($time >>> 32 ^ $time);
		final long $blocktime = this.getBlocktime();
		result = result * PRIME + (int)($blocktime >>> 32 ^ $blocktime);
		return result;
	}
}