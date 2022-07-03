# To print version of python
import sys
print(sys.version.split()[0])


# Normal print statement
print('Learn Python!')


# Declaring age and using it
age = 20
print(f'I am {age} years old.')

# Using formate print statemnts
lang = 'Python'
version = '3.8'
print(f'I am learning {lang} version {version}')


# printing with variables
price = 199.99
print('This costs', price)

price = 69.99
print(f'This costs {price}')

price = 34.99
weight = 20
print(f'Price: ${price}. Weight: {weight} lbs.')


# Limiting decimal values
pi = 3.1415926535
print(f'Pi: {pi:.2f}')


# Strings in print
print('-' * 40)
print('VERSION: 1.0.1')
print('-' * 40)

print('=' * 40)
print('author: johnsmith@sample.com')
print('date: 01-01-2021')
print('=' * 40)


# Using different seperate option
print('summer', 'time', 'holiday', sep='#')