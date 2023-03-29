package io.metaloom.test.container.provider.common.version;

import java.util.Properties;

public class BuildInfo {
	private String version;
	private String buildtimestamp;

	public BuildInfo(String version, String buildtimestamp) {
		this.version = version;
		this.buildtimestamp = buildtimestamp;
	}

	/**
	 * Create a new build info using the provided properties.
	 * 
	 * @param buildProperties
	 */
	public BuildInfo(Properties buildProperties) {
		this(buildProperties.getProperty("provider.version"), buildProperties.getProperty("provider.build.timestamp"));
	}

	/**
	 * Return the build timestamp.
	 * 
	 * @return
	 */
	public String getBuildtimestamp() {
		return buildtimestamp;
	}

	/**
	 * Set the build timestamp
	 * 
	 * @param buildtimestamp
	 * @return Fluent API
	 */
	public BuildInfo setBuildtimestamp(String buildtimestamp) {
		this.buildtimestamp = buildtimestamp;
		return this;
	}

	/**
	 * Return the version string.
	 * 
	 * @return
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set the version string.
	 * 
	 * @param version
	 * @return
	 */
	public BuildInfo setVersion(String version) {
		this.version = version;
		return this;
	}

	@Override
	public String toString() {
		return getVersion() + " " + getBuildtimestamp();
	}
}
