# Spartan Webhooks
This version of Spartan Webhooks is a complete rewrite
mainly in the Kotlin language for ease for programming.

However, it will include many new features which are attractive:
  * JSON based embed configuration
    * Popular builders like [this one](https://glitchii.github.io/embedbuilder/) can now be utilized
  * Custom Discord API for sending Webhooks
    * No longer bloats the file size by relying on a comprehensive API to do one simple task
    * Better control and prevention of 429 (rate-limiting errors)
  * Only one webhook is sent per faucet instance per user
    * This is a little wordy, but it essentially means that you'll have a lot less webhooks sent (also limits 429s)
  * And many, many more to come!

This newer version will also rely on Paper, instead of Spigot in
order to make use of some newer features like Components that Spigot
still fails to support. Only the latest Minecraft version will be provided
support and actively maintained. You can modify/rebuild the project to
function on different versions at your leisure.