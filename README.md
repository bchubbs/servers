# servers
**VERY OLD (2018)** Server API used in Krypton \
\
This impl server management system allows us to check the specified server's port, group, and announcement. Additionally, we can add servers to the proxy without restarting the entire Bungee through Spigot. This is very useful when setting up event/test servers. \
\
Port checking is used to compare and identify each Spigot servers from eachother. \
\
Groups are used to put specific servers into different groups. For example, Hub1 and Hub2 are put into the "Hub" group, while KitPvP and Skywars are put into the "Game" group.\
The purpose of this is for our PENV dump that logs statistics on what games players enjoy (and are most active on.)
\
Announcements are used to send messages between Spigot servers, similar to a Redis "PubSub", but through MySQL. Additionally, when an announcement is updated, we can choose to broadcast this announcement to every server under the proxy. Similar to /alert, but our plugins will look for these messages. I wouldn't advise broadcasting these messages unless it is for testing purposes.\
\
A few people have asked me for the code we use regarding our server API, so here it is. You can modify and use this code in whatever ways you seem fit.\
You'll need to modify this code in order to setup MySQL properly, as I can't give away the SQLHandler class.

**Other Notes**\
In order to add/remove servers to the proxy, you'll need to simply listen for when a new server is added (using a command such as /setserver), and add the port to Bungee's config.yml. Then, reload the config. Essentially, you'll need a Bungee plugin and a Spigot plugin to accomplish this.

Besides identifying servers, this server impl allows us to check what server a punishment was added on, or a grant's scope can be identified.

**Production**\
I wouldn't recommend using this code for production purposes, as exceptions aren't properly handled. Additionally, there is no impl class. I would recommend heavily modifying this, which I may do at a future date.
