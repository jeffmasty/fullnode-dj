// Generated by delombok at Wed Apr 20 02:15:35 MDT 2016
package org.fullnodej.data;

public class SignedTransaction {
	
	/**
	 * serialized transaction with signatures (possibly zero signatures)
	 */
	String hex;
	
	/**
	 * what say ye?
	 */
	boolean complete;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public SignedTransaction() {
	}

	/**
	 * serialized transaction with signatures (possibly zero signatures)
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getHex() {
		return this.hex;
	}

	/**
	 * what say ye?
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean isComplete() {
		return this.complete;
	}

	/**
	 * serialized transaction with signatures (possibly zero signatures)
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setHex(final String hex) {
		this.hex = hex;
	}

	/**
	 * what say ye?
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setComplete(final boolean complete) {
		this.complete = complete;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof SignedTransaction)) return false;
		final SignedTransaction other = (SignedTransaction)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		final java.lang.Object this$hex = this.getHex();
		final java.lang.Object other$hex = other.getHex();
		if (this$hex == null ? other$hex != null : !this$hex.equals(other$hex)) return false;
		if (this.isComplete() != other.isComplete()) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof SignedTransaction;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $hex = this.getHex();
		result = result * PRIME + ($hex == null ? 43 : $hex.hashCode());
		result = result * PRIME + (this.isComplete() ? 79 : 97);
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "SignedTransaction(hex=" + this.getHex() + ", complete=" + this.isComplete() + ")";
	}
}