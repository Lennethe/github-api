// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.2" exclude ("org.webjars", "npm"))

// Defines scaffolding (found under .g8 folder)
// http://www.foundweekends.org/giter8/scaffolding.html
// sbt "g8Scaffold form"
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.11.0")

addSbtPlugin("com.payintech" % "sbt-play-ebean" % "20.02")
