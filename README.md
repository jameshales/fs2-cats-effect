# fs2-cats-effect #

A backport of [IOAsyncInstances](https://github.com/functional-streams-for-scala/fs2-cats/blob/v0.4.0/shared/src/main/scala/fs2/interop/cats/IOAsyncInstances.scala) from [fs2-cats](https://github.com/functional-streams-for-scala/fs2-cats) to cats 0.9.0.

## Installation ##

### Requirements ###

* [SBT](https://www.scala-sbt.org) 0.13.16+

### Installing ###

`$ sbt publishLocal`

## Usage ##

```scala
import cats.effect.IO
import fs2.Stream
import fs2.interop.cats.effect._

import scala.concurrent.ExecutionContext.Implicits.global

val helloWorld: Stream[IO, Unit] =
  Stream.eval(IO(println("Hello, world!")))

helloWorld.run.unsafeRunSync
```

## License

[MIT](https://choosealicense.com/licenses/mit/)
