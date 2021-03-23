'''
from random import randint,choice

a = ['apple','pear']
del a[0]
print(a)
del a[0]
print(a)
a = 0.2+0.1
x, y, z = 1, 2, 3
print(f"my favorite number is {a}")
a = "Hello"
b = "Hi"
c = f"{a} {b}"
print(c)
c.rstrip()
c.lstrip()
c.strip()
cube = [value**3 for value in range(11)]
print(cube)


food = {}
food['Ray'] = 'Eggs'
food['Dorothy'] = 'Biscuit'
food['Tom'] = 'Eggs'
food['Tek'] = 'Ham'
for key,value in (food.items()):
	print(f"Name:{key}")
	print(f"Food:{value.title()}\n")
for key in set(food.values()):
	print(key.upper())

languages = {'python','english','Mandarin','english','python'}
print(languages)


users = {
	'Ray': {
		'first' : 'Jian',
		'last' : 'Qin',
		'location' : 'Beijing',
	},

	'Dorothy': {
		'first' : 'Zhen',
		'last' : 'Fang',
		'location' : 'Los Angelos',
	},
}

for user_name, user_info in users.items():
	print(f"\nUser Name: {user_name}")
	full_name = f"{user_info['first']} {user_info['last']}"
	location = user_info['location']
	print(f"\tFull name: {full_name.upper()}")
	print(f"\tLocation: {location.upper()}")

message = input("Tell me your name:\n")
print(message)


def build_profile(first,last,**user_info):
	user_info['first_name'] = first
	user_info['last_name'] = last
	return user_info

user_profile = build_profile('Jian','Qin',location='San Diego',degree='bachelor')
print(user_profile)


class Dog:
	"""A simple attempt to model a dog."""

	def __init__(self, name, age):
		"""Initialize name and age attributes."""
		self.name = name
		self.age = age

	def sit(self):
		"""Simulate a dog sitting in response to a command"""
		print(f"{self.name} is now sitting.")

	def roll(self):
		"""Simulate rolling over in response to a command"""
		print(f"{self.name} rolled over!")

your_dog = Dog('Willie',6)

my_dog = Dog('Dorothy',1)
my_dog.sit()
my_dog.roll()

class Car:
	"""A simple attempt to represent a car"""

	def __init__(self,make,model,year):
		"""Initialize attributes to describe a car"""
		self.make = make
		self.model = model
		self.year = year
		self.odometer_reading = 0

	def description(self):
		"""Return a neatly formatted descriptive name"""
		long_name = f"{self.year} {self.make} {self.model}"
		return long_name.title()

	def read_odometer(self):
		"""Print a statement showing the car's mileage."""
		print("This car has "+ str(self.odometer_reading) +" miles on it")

	def update_odometer(self,mileage):
		"""Set the odometer reading to the given value
			Stop the odometer from rolling back
		"""
		if mileage >= self.odometer_reading:
			self.odometer_reading = mileage
		else:
			print("You cannot roll back an odometer")

	def increment_odometer(self,miles):
		"""Add given amount to the odometer"""
		self.odometer_reading += miles

class Battery:
	"""Model battery of a car"""
	def __init__(self,battery_size=75):
		self.battery_size = battery_size
		
	def describe_battery(self):
		print(f"This car has a {self.battery_size}-kWh battery")

	def get_range(self):
		if self.battery_size == 75:
			range = 260
		elif self.battery_size == 100:
			range = 315
		print(f"This car can go about {range} miles on a full charge")

class ElectricCar(Car):
	"""Represent aspects of a car, specific to an electric car"""

	def __init__(self,make,model,year):
		"""Initialize attributes of the parent class"""
		super().__init__(make,model,year)
		self.battery_size = 75
		self.battery = Battery()

my_tesla = ElectricCar('tesla','model s',2019)
print(my_tesla.description())
my_tesla.battery.describe_battery()
my_tesla.battery.get_range()

players = ['Jian','Fang','Yao','Heng']
first_up = choice(players)
print(f"{first_up} is going first")


with open('pi_digit.txt') as file_object:
	lines = file_object.readlines()

pi_string = ''
for line in lines:
	pi_string += line.strip()

print(pi_string)

'''

