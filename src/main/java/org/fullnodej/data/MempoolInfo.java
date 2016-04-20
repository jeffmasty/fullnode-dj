// Generated by delombok at Wed Apr 20 02:15:35 MDT 2016
package org.fullnodej.data;

/**
 * @see <a href="https://bitcoin.org/en/developer-reference#getmempoolinfo">getmempoolinfo wiki</a>
 */
public class MempoolInfo {
	
	/**
	 * count of transactions in mempool
	 */
	int size;
	
	/**
	 * size of mempool in bytes
	 */
	int bytes;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public MempoolInfo() {
	}

	/**
	 * count of transactions in mempool
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getSize() {
		return this.size;
	}

	/**
	 * size of mempool in bytes
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getBytes() {
		return this.bytes;
	}

	/**
	 * count of transactions in mempool
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setSize(final int size) {
		this.size = size;
	}

	/**
	 * size of mempool in bytes
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setBytes(final int bytes) {
		this.bytes = bytes;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof MempoolInfo)) return false;
		final MempoolInfo other = (MempoolInfo)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		if (this.getSize() != other.getSize()) return false;
		if (this.getBytes() != other.getBytes()) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof MempoolInfo;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.getSize();
		result = result * PRIME + this.getBytes();
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "MempoolInfo(size=" + this.getSize() + ", bytes=" + this.getBytes() + ")";
	}
}