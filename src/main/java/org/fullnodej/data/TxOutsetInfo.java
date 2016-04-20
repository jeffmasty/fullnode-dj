// Generated by delombok at Wed Apr 20 02:15:35 MDT 2016
package org.fullnodej.data;

import java.math.BigDecimal;

public class TxOutsetInfo {
	
	/**
	 * height of the local best block chain. A new node with only the hardcoded genesis block will have a height of 0
	 */
	int height;
	
	/**
	 * hex of the hash of the header of the highest block on the local best block chain
	 */
	String bestblock;
	
	/**
	 * number of transactions with unspent outputs
	 */
	int transactions;
	
	/**
	 * number of unspent transaction outputs
	 */
	int txouts;
	
	/**
	 * size of the serialized UTXO set in bytes; not counting overhead, this is the size of the
	 * chainstate directory in the Bitcoin Core configuration directory
	 */
	int bytes_serialized;
	
	/**
	 * hex of SHA256(SHA256()) hash of the serialized UTXO set; useful for comparing two nodes to see if they have the
	 * same set (they should, if they always used the same serialization format and currently have the same best block).
	 */
	String hash_serialized;
	
	/**
	 * total number of bitcoins in the UTXO set
	 */
	BigDecimal total_amount;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public TxOutsetInfo() {
	}

	/**
	 * height of the local best block chain. A new node with only the hardcoded genesis block will have a height of 0
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getHeight() {
		return this.height;
	}

	/**
	 * hex of the hash of the header of the highest block on the local best block chain
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getBestblock() {
		return this.bestblock;
	}

	/**
	 * number of transactions with unspent outputs
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getTransactions() {
		return this.transactions;
	}

	/**
	 * number of unspent transaction outputs
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getTxouts() {
		return this.txouts;
	}

	/**
	 * size of the serialized UTXO set in bytes; not counting overhead, this is the size of the
	 * chainstate directory in the Bitcoin Core configuration directory
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getBytes_serialized() {
		return this.bytes_serialized;
	}

	/**
	 * hex of SHA256(SHA256()) hash of the serialized UTXO set; useful for comparing two nodes to see if they have the
	 * same set (they should, if they always used the same serialization format and currently have the same best block).
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getHash_serialized() {
		return this.hash_serialized;
	}

	/**
	 * total number of bitcoins in the UTXO set
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public BigDecimal getTotal_amount() {
		return this.total_amount;
	}

	/**
	 * height of the local best block chain. A new node with only the hardcoded genesis block will have a height of 0
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setHeight(final int height) {
		this.height = height;
	}

	/**
	 * hex of the hash of the header of the highest block on the local best block chain
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setBestblock(final String bestblock) {
		this.bestblock = bestblock;
	}

	/**
	 * number of transactions with unspent outputs
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setTransactions(final int transactions) {
		this.transactions = transactions;
	}

	/**
	 * number of unspent transaction outputs
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setTxouts(final int txouts) {
		this.txouts = txouts;
	}

	/**
	 * size of the serialized UTXO set in bytes; not counting overhead, this is the size of the
	 * chainstate directory in the Bitcoin Core configuration directory
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setBytes_serialized(final int bytes_serialized) {
		this.bytes_serialized = bytes_serialized;
	}

	/**
	 * hex of SHA256(SHA256()) hash of the serialized UTXO set; useful for comparing two nodes to see if they have the
	 * same set (they should, if they always used the same serialization format and currently have the same best block).
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setHash_serialized(final String hash_serialized) {
		this.hash_serialized = hash_serialized;
	}

	/**
	 * total number of bitcoins in the UTXO set
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setTotal_amount(final BigDecimal total_amount) {
		this.total_amount = total_amount;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof TxOutsetInfo)) return false;
		final TxOutsetInfo other = (TxOutsetInfo)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		if (this.getHeight() != other.getHeight()) return false;
		final java.lang.Object this$bestblock = this.getBestblock();
		final java.lang.Object other$bestblock = other.getBestblock();
		if (this$bestblock == null ? other$bestblock != null : !this$bestblock.equals(other$bestblock)) return false;
		if (this.getTransactions() != other.getTransactions()) return false;
		if (this.getTxouts() != other.getTxouts()) return false;
		if (this.getBytes_serialized() != other.getBytes_serialized()) return false;
		final java.lang.Object this$hash_serialized = this.getHash_serialized();
		final java.lang.Object other$hash_serialized = other.getHash_serialized();
		if (this$hash_serialized == null ? other$hash_serialized != null : !this$hash_serialized.equals(other$hash_serialized)) return false;
		final java.lang.Object this$total_amount = this.getTotal_amount();
		final java.lang.Object other$total_amount = other.getTotal_amount();
		if (this$total_amount == null ? other$total_amount != null : !this$total_amount.equals(other$total_amount)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof TxOutsetInfo;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.getHeight();
		final java.lang.Object $bestblock = this.getBestblock();
		result = result * PRIME + ($bestblock == null ? 43 : $bestblock.hashCode());
		result = result * PRIME + this.getTransactions();
		result = result * PRIME + this.getTxouts();
		result = result * PRIME + this.getBytes_serialized();
		final java.lang.Object $hash_serialized = this.getHash_serialized();
		result = result * PRIME + ($hash_serialized == null ? 43 : $hash_serialized.hashCode());
		final java.lang.Object $total_amount = this.getTotal_amount();
		result = result * PRIME + ($total_amount == null ? 43 : $total_amount.hashCode());
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "TxOutsetInfo(height=" + this.getHeight() + ", bestblock=" + this.getBestblock() + ", transactions=" + this.getTransactions() + ", txouts=" + this.getTxouts() + ", bytes_serialized=" + this.getBytes_serialized() + ", hash_serialized=" + this.getHash_serialized() + ", total_amount=" + this.getTotal_amount() + ")";
	}
}