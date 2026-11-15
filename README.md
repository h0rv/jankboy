# jankboy

Build a real Game Boy emulator while learning Clojure, computer architecture, and how to model a machine as data. Retro games make it something I want to use, not just an exercise.

V1 is a complete program that plays the included [Game Boy Raw Snake ROM](roms/raw-snake/snake.gb). Aim for 5 to 10 focused hours, recognizing that this is ambitious. Get a raylib window working early, then build the hardware behavior needed for one playable ROM. Audio, save states, cycle-perfect accuracy, and broad compatibility can wait.

I write and understand the interesting parts. The agent tutors and pairs, and can handle repetitive or unhelpful busywork with my permission. It must not generate the emulator for me.

Install the tools with [mise](https://mise.jdx.dev/):

```sh
mise install
mise run run
```

Edit `src/jankboy/main.jank`, save, and run `mise run run` in another terminal. Repeat after each change.

Follow the [learning guide](docs/index.html) to start building.
