// Generated by delombok at Wed Apr 20 02:15:35 MDT 2016
package org.fullnodej.data;

import java.math.BigDecimal;

public class Utxo extends Outpoint {
	
	/**
	 * base58 P2PKH or P2SH address the output paid. Only returned for P2PKH or P2SH output scripts
	 */
	String address;
	
	/**
	 * If the address returned belongs to an account, this is the account. Otherwise not returned
	 */
	String account;
	
	/**
	 * hex of the output script paid
	 */
	String scriptPubKey;
	
	/**
	 * If the output is a P2SH whose script belongs to this wallet, this is the redeem script in hex
	 */
	String redeemScript;
	
	/**
	 * amount paid to the output in bitcoins
	 */
	BigDecimal amount;
	
	/**
	 * number of confirmations received for the transaction containing this output
	 */
	int confirmations;
	
	/**
	 * Added in Bitcoin Core 0.10.0, false watch-only outputs
	 */
	boolean spendable;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public Utxo() {
	}

	/**
	 * base58 P2PKH or P2SH address the output paid. Only returned for P2PKH or P2SH output scripts
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getAddress() {
		return this.address;
	}

	/**
	 * If the address returned belongs to an account, this is the account. Otherwise not returned
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getAccount() {
		return this.account;
	}

	/**
	 * hex of the output script paid
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getScriptPubKey() {
		return this.scriptPubKey;
	}

	/**
	 * If the output is a P2SH whose script belongs to this wallet, this is the redeem script in hex
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getRedeemScript() {
		return this.redeemScript;
	}

	/**
	 * amount paid to the output in bitcoins
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public BigDecimal getAmount() {
		return this.amount;
	}

	/**
	 * number of confirmations received for the transaction containing this output
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getConfirmations() {
		return this.confirmations;
	}

	/**
	 * Added in Bitcoin Core 0.10.0, false watch-only outputs
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean isSpendable() {
		return this.spendable;
	}

	/**
	 * base58 P2PKH or P2SH address the output paid. Only returned for P2PKH or P2SH output scripts
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setAddress(final String address) {
		this.address = address;
	}

	/**
	 * If the address returned belongs to an account, this is the account. Otherwise not returned
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setAccount(final String account) {
		this.account = account;
	}

	/**
	 * hex of the output script paid
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setScriptPubKey(final String scriptPubKey) {
		this.scriptPubKey = scriptPubKey;
	}

	/**
	 * If the output is a P2SH whose script belongs to this wallet, this is the redeem script in hex
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setRedeemScript(final String redeemScript) {
		this.redeemScript = redeemScript;
	}

	/**
	 * amount paid to the output in bitcoins
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setAmount(final BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * number of confirmations received for the transaction containing this output
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setConfirmations(final int confirmations) {
		this.confirmations = confirmations;
	}

	/**
	 * Added in Bitcoin Core 0.10.0, false watch-only outputs
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setSpendable(final boolean spendable) {
		this.spendable = spendable;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "Utxo(address=" + this.getAddress() + ", account=" + this.getAccount() + ", scriptPubKey=" + this.getScriptPubKey() + ", redeemScript=" + this.getRedeemScript() + ", amount=" + this.getAmount() + ", confirmations=" + this.getConfirmations() + ", spendable=" + this.isSpendable() + ")";
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof Utxo)) return false;
		final Utxo other = (Utxo)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$address = this.getAddress();
		final java.lang.Object other$address = other.getAddress();
		if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
		final java.lang.Object this$account = this.getAccount();
		final java.lang.Object other$account = other.getAccount();
		if (this$account == null ? other$account != null : !this$account.equals(other$account)) return false;
		final java.lang.Object this$scriptPubKey = this.getScriptPubKey();
		final java.lang.Object other$scriptPubKey = other.getScriptPubKey();
		if (this$scriptPubKey == null ? other$scriptPubKey != null : !this$scriptPubKey.equals(other$scriptPubKey)) return false;
		final java.lang.Object this$redeemScript = this.getRedeemScript();
		final java.lang.Object other$redeemScript = other.getRedeemScript();
		if (this$redeemScript == null ? other$redeemScript != null : !this$redeemScript.equals(other$redeemScript)) return false;
		final java.lang.Object this$amount = this.getAmount();
		final java.lang.Object other$amount = other.getAmount();
		if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
		if (this.getConfirmations() != other.getConfirmations()) return false;
		if (this.isSpendable() != other.isSpendable()) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof Utxo;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $address = this.getAddress();
		result = result * PRIME + ($address == null ? 43 : $address.hashCode());
		final java.lang.Object $account = this.getAccount();
		result = result * PRIME + ($account == null ? 43 : $account.hashCode());
		final java.lang.Object $scriptPubKey = this.getScriptPubKey();
		result = result * PRIME + ($scriptPubKey == null ? 43 : $scriptPubKey.hashCode());
		final java.lang.Object $redeemScript = this.getRedeemScript();
		result = result * PRIME + ($redeemScript == null ? 43 : $redeemScript.hashCode());
		final java.lang.Object $amount = this.getAmount();
		result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
		result = result * PRIME + this.getConfirmations();
		result = result * PRIME + (this.isSpendable() ? 79 : 97);
		return result;
	}
}