// Generated by delombok at Wed Apr 20 02:15:35 MDT 2016
package org.fullnodej.data;

import java.net.InetAddress;

public class LocalAddress {
	InetAddress address;
	int port;
	int score;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public LocalAddress() {
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public InetAddress getAddress() {
		return this.address;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getPort() {
		return this.port;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getScore() {
		return this.score;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setAddress(final InetAddress address) {
		this.address = address;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setPort(final int port) {
		this.port = port;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setScore(final int score) {
		this.score = score;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof LocalAddress)) return false;
		final LocalAddress other = (LocalAddress)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		final java.lang.Object this$address = this.getAddress();
		final java.lang.Object other$address = other.getAddress();
		if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
		if (this.getPort() != other.getPort()) return false;
		if (this.getScore() != other.getScore()) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof LocalAddress;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $address = this.getAddress();
		result = result * PRIME + ($address == null ? 43 : $address.hashCode());
		result = result * PRIME + this.getPort();
		result = result * PRIME + this.getScore();
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "LocalAddress(address=" + this.getAddress() + ", port=" + this.getPort() + ", score=" + this.getScore() + ")";
	}
}