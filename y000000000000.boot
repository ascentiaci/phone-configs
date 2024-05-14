#!version:1.0.0.1

### This file contains the settings required for teams to work on the Yealink phones


### The following values will set the time zone to PST

local_time.time_zone = -8:00

### The following values will disable the power led flashing

phone_setting.mail_power_led_flash_enable = 0
phone_setting.missed_call_power_led_flash.enable = 0

## The following value will ensure transfers made using the phone button will be the Attended style of transfer.
transfer.dsskey_deal_type = 1

### The following values will set the user and admin users to the same password - Only IT Admins will know this.

security.user_password = admin:6048553315
security.user_password = user:6048553315

include:config http://noam.ipp.sdg.teams.microsoft.com
include:config $mac.cfg