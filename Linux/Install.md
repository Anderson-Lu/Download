#### Install Chrome on Ubuntu

Google Chrome isn't in the repositories - however, Chromium is.
Google Chrome is only available for 64-bit Linux. I've included directions for 64 below.
To install Google Chrome, run the following:

```shell
wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | 
sudo apt-key add -
sudo sh -c 'echo "deb https://dl.google.com/linux/chrome/deb/ stable main"
>> /etc/apt/sources.list.d/google.list'
sudo apt-get update
sudo apt-get install google-chrome-stable
```

If error messages pop up after running the command sudo dpkg -i google-chrome\*.deb then run the command :
```shell
sudo apt-get install -f
```
and then re-run the previous command. The error messages mentioned should include something similar to:
```shell
google-chrome-stable depends on [lib-example]; however; Package [lib-example] is not installed.
```

This installs a needed library for Google Chrome, then downloads the latest version of Chrome to a temporary directory and installs it. Run google-chrome to start the browser.

During the installation a PPA is added to your system so that Google Chrome receives the latest updates whenever you check for system updates.

#### Install nodejs errors occour

```shell
$ npm install thingy
npm WARN ENOENT ENOENT: no such file or directory, open '/tmp/tmpdir/R3semq/package.json'
```
Use command below to solve this problem for npm 3.+
```shell
$ npm init -y
```

#### Install deb file on shell

```shell
$ sudo dpkg -i xxx.deb  
```
Obviously, to uninstall a software, you can use:
```shell
$ sudo dpkg -r xxx.deb
```
And to re-configure a package, you can use:
```shell
$ sudo dpkg-reconfigure PACKAGE_NAME
```
This is useful when you need to reconfigure something related to said package. Some useful examples it the keyboard-configuration when you want to enable the `Ctrl+Alt+Backspace` in order to reset the X server, so you would the following:
```shell
sudo dpkg-reconfigure keyboard-configuration
```
Another great one is when you need to set the Timezone for a server or your local testing computer, so you use use the tzdata package:
```shell
sudo dpkg-reconfigure tzdata
```

