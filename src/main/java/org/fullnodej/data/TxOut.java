// Generated by delombok at Wed Apr 20 02:15:35 MDT 2016
package org.fullnodej.data;

import java.math.BigDecimal;

public class TxOut {
	
	/**
	 * header hash of local best block including this tx in hex. not mined=empty
	 */
	String bestblock;
	int confirmations;
	BigDecimal value;
	ScriptPubKey scriptPubKey;
	int version;
	boolean coinbase;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public TxOut() {
	}

	/**
	 * header hash of local best block including this tx in hex. not mined=empty
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getBestblock() {
		return this.bestblock;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getConfirmations() {
		return this.confirmations;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public BigDecimal getValue() {
		return this.value;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public ScriptPubKey getScriptPubKey() {
		return this.scriptPubKey;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getVersion() {
		return this.version;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean isCoinbase() {
		return this.coinbase;
	}

	/**
	 * header hash of local best block including this tx in hex. not mined=empty
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setBestblock(final String bestblock) {
		this.bestblock = bestblock;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setConfirmations(final int confirmations) {
		this.confirmations = confirmations;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setValue(final BigDecimal value) {
		this.value = value;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setScriptPubKey(final ScriptPubKey scriptPubKey) {
		this.scriptPubKey = scriptPubKey;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setVersion(final int version) {
		this.version = version;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setCoinbase(final boolean coinbase) {
		this.coinbase = coinbase;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof TxOut)) return false;
		final TxOut other = (TxOut)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		final java.lang.Object this$bestblock = this.getBestblock();
		final java.lang.Object other$bestblock = other.getBestblock();
		if (this$bestblock == null ? other$bestblock != null : !this$bestblock.equals(other$bestblock)) return false;
		if (this.getConfirmations() != other.getConfirmations()) return false;
		final java.lang.Object this$value = this.getValue();
		final java.lang.Object other$value = other.getValue();
		if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
		final java.lang.Object this$scriptPubKey = this.getScriptPubKey();
		final java.lang.Object other$scriptPubKey = other.getScriptPubKey();
		if (this$scriptPubKey == null ? other$scriptPubKey != null : !this$scriptPubKey.equals(other$scriptPubKey)) return false;
		if (this.getVersion() != other.getVersion()) return false;
		if (this.isCoinbase() != other.isCoinbase()) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof TxOut;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $bestblock = this.getBestblock();
		result = result * PRIME + ($bestblock == null ? 43 : $bestblock.hashCode());
		result = result * PRIME + this.getConfirmations();
		final java.lang.Object $value = this.getValue();
		result = result * PRIME + ($value == null ? 43 : $value.hashCode());
		final java.lang.Object $scriptPubKey = this.getScriptPubKey();
		result = result * PRIME + ($scriptPubKey == null ? 43 : $scriptPubKey.hashCode());
		result = result * PRIME + this.getVersion();
		result = result * PRIME + (this.isCoinbase() ? 79 : 97);
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "TxOut(bestblock=" + this.getBestblock() + ", confirmations=" + this.getConfirmations() + ", value=" + this.getValue() + ", scriptPubKey=" + this.getScriptPubKey() + ", version=" + this.getVersion() + ", coinbase=" + this.isCoinbase() + ")";
	}
}