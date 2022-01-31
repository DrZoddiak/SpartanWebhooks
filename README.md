# Spartan Webhooks
This version of Spartan Webhooks is a complete rewrite
mainly in the Kotlin language for ease for programming.

However, it will include many new features which are attractive:
  * JSON based embed configuration
    * Popular builders like [this one](https://glitchii.github.io/embedbuilder/) can now be utilized
    * Supports non-embed messages too!
  * Custom Discord API for sending Webhooks
    * Only includes what is necessary
    * Better control and prevention of 429 (rate-limiting errors)
  * Only one webhook is sent per user every few seconds
    * Limits 429s and makes it easier to keep track of messages
  * More configuration options & cleaner configuration
    * Change how often a user's webhook is sent
    * No more hunting for essential fields to modify
    * Toggle if certain checks report to webhooks
  * And many, many more to come!

This newer version will also rely on Paper, instead of Spigot in
order to make use of some newer features like Components that Spigot
still fails to support. Only the latest Minecraft version will be provided
support and actively maintained. You can modify/rebuild the project to
function on different versions at your leisure.