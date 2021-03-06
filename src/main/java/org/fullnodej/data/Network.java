// Generated by delombok at Wed Apr 20 02:15:35 MDT 2016
package org.fullnodej.data;

public class Network {
	String name;
	boolean limited;
	boolean reachable;
	String proxy;
	boolean proxy_randomize_credentials;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public Network() {
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getName() {
		return this.name;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean isLimited() {
		return this.limited;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean isReachable() {
		return this.reachable;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getProxy() {
		return this.proxy;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean isProxy_randomize_credentials() {
		return this.proxy_randomize_credentials;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setName(final String name) {
		this.name = name;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setLimited(final boolean limited) {
		this.limited = limited;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setReachable(final boolean reachable) {
		this.reachable = reachable;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setProxy(final String proxy) {
		this.proxy = proxy;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public void setProxy_randomize_credentials(final boolean proxy_randomize_credentials) {
		this.proxy_randomize_credentials = proxy_randomize_credentials;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof Network)) return false;
		final Network other = (Network)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		final java.lang.Object this$name = this.getName();
		final java.lang.Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		if (this.isLimited() != other.isLimited()) return false;
		if (this.isReachable() != other.isReachable()) return false;
		final java.lang.Object this$proxy = this.getProxy();
		final java.lang.Object other$proxy = other.getProxy();
		if (this$proxy == null ? other$proxy != null : !this$proxy.equals(other$proxy)) return false;
		if (this.isProxy_randomize_credentials() != other.isProxy_randomize_credentials()) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof Network;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		result = result * PRIME + (this.isLimited() ? 79 : 97);
		result = result * PRIME + (this.isReachable() ? 79 : 97);
		final java.lang.Object $proxy = this.getProxy();
		result = result * PRIME + ($proxy == null ? 43 : $proxy.hashCode());
		result = result * PRIME + (this.isProxy_randomize_credentials() ? 79 : 97);
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "Network(name=" + this.getName() + ", limited=" + this.isLimited() + ", reachable=" + this.isReachable() + ", proxy=" + this.getProxy() + ", proxy_randomize_credentials=" + this.isProxy_randomize_credentials() + ")";
	}
}