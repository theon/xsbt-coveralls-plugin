resolvers ++= Seq(
  "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

addSbtPlugin("com.github.theon" %% "xsbt-coveralls-plugin-meta" % "0.0.6")