// Generated by delombok at Wed Apr 20 02:15:35 MDT 2016
package org.fullnodej.data;

/**
 * see <a href="https://bitcoin.org/en/developer-reference#getchaintips">getchaintips wiki</a>
 */
public enum ChainTipStatus {
	active("active"),
	invalid("invalid"),
	headersOnly("headers-only"),
	validHeaders("valid-headers"),
	validFork("valid-fork"),
	unkown("unkown");
	private final String value;

	@Override
	public String toString() {
		return value;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	private ChainTipStatus(final String value) {
		this.value = value;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getValue() {
		return this.value;
	}
}