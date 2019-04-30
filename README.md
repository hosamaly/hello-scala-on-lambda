# Minimal scala project for AWS Lambda

- To build the project: `sbt dist`.
- Upload the zip file generated in [target/universal](target/universal/) to AWS Lambda.
- Configure the Lambda to use `demo.App::run` as the handler.

Created for [Scala Central Meetup #22](https://www.meetup.com/Scala-Central/events/259324550/).
The presentation was [recorded in video](https://www.youtube.com/watch?v=ws4TZSpQlcU).
