import random
import sys

def main():
	data = []
	for i in range(10):
		data.append(i)
	random.shuffle(data)
	print(data)
	selection_sort(data)
	print(data)


def selection_sort(data):
	for i in range (len(data)):
		smallest_value = sys.maxsize
		smallest_index = -1
		for j in range(i + 1, len(data)):
			if data[j] < smallest_value:
				smallest_value = data[j]
				smallest_index = j
				print(f'i is {data[i]}, smallest is {data[smallest_index]}')
		if smallest_value < data[i]:
			temp = data[i]
			data[i] = data[smallest_index]
			data[smallest_index] = temp
		print(data)

if __name__ == '__main__':
	main()

